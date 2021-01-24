package timesheet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Company {

    private List<Project> projects = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();

    public Company(InputStream employeesFile, InputStream projectFile) {
        try (BufferedReader employeeReader = new BufferedReader(new InputStreamReader(employeesFile))) {
            String line;
            while ((line = employeeReader.readLine()) != null) {
                String[] name = line.split(" ");
                employees.add(new Employee(name[0], name[1]));

            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        try (BufferedReader projectReader = new BufferedReader(new InputStreamReader(projectFile))) {
            String line;
            while ((line = projectReader.readLine()) != null) {
                String[] name = line.split(" ");
                projects.add(new Project(line));
            }


        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }


    }

    public List<Project> getProjects() {
        return new ArrayList<>(projects);
    }

    public List<Employee> getEmployees() {
        return new ArrayList(employees);
    }

    public List<TimeSheetItem> getTimeSheetItems() {
        return timeSheetItems;
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        timeSheetItems.add(new TimeSheetItem(employee, project, beginDate, endDate));
    }
// ez nem saját találmány :)
    public List<ReportLine> calculateProjectByNameYearMonth(String employeeName, int year, int month) {
        int i = 0;
        boolean found = false;
        List<ReportLine> report = new ArrayList<>();
        List<TimeSheetItem> filteredTSItemsByName = new ArrayList<>();
        Map<String, Integer> pPairs = new HashMap<>();
        for (Project item : projects) {
            report.add(new ReportLine(item, 0L));
            pPairs.put(item.getName(), i++);
        }
        for (Employee item : employees) {
            if (item.getName().equals(employeeName)) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Not a company member");
        }

        filteredTSItemsByName = timeSheetItems.stream().filter((timeSheetItem) ->
                timeSheetItem.getEmployee().getName().equals(employeeName) &&
                        timeSheetItem.getBeginDate().getYear() == year &&
                        timeSheetItem.getBeginDate().getMonthValue() == month).collect(Collectors.toList());

        for (TimeSheetItem item : filteredTSItemsByName) {
            String pName = item.getProject().getName();
            report.get(pPairs.get(pName)).addTime(item.hoursBetweenDates());
        }
        return report;
    }

    public void printToFile(String employeeName, int year, int month, Path file) {
        String rLine = employeeName + "\t" + year + "-" + String.format("%02d", month) + "\t";
        List<ReportLine> reportLines;
        int totalHours = 0;

        reportLines = calculateProjectByNameYearMonth(employeeName, year, month);
        for (ReportLine item : reportLines) {
            totalHours += item.getTime();
        }
        rLine += totalHours + "\n";

        for (ReportLine item : reportLines) {
            if (item.getTime() != 0) {
                rLine += item.getProject().getName() + "\t" + item.getTime() + "\n";
            }
        }
        try {
            Files.writeString(file, rLine);
        } catch (IOException ioe) {
            throw new IllegalStateException();
        }
    }
}


