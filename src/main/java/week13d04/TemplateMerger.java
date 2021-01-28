package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    private List<Employee> employees = new ArrayList<>();

    public String merge(Path file, List<Employee> employees) {
        StringBuilder employeeTable = new StringBuilder();
        try {
            String template = Files.readString(file);

            String[] helpArray= splitter(template);

            for (int i=0; i< employees.size();i++) {
                employeeTable.append(helpArray[0]);
                employeeTable.append( ": ");
                employeeTable.append(employees.get(i).getName());
                employeeTable.append(",");
                employeeTable.append(helpArray[2]);
                employeeTable.append(": ");
                employeeTable.append(employees.get(i).getYear());
                employeeTable.append("\n");


            }return employeeTable.toString();


        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }


    }

    private String[] splitter(String text) {

        String[] arr = text.split(":");
        String firstPart = arr[0];
        String fourthPart = arr[2];
        String[] arr2 = arr[1].split(",");
        String secondPart = arr2[0];
        String thirdPart = arr2[1];

        String [] result = new String[]{firstPart, secondPart, thirdPart, fourthPart};
        return result;

    }



    public static void main(String[] args) {
        TemplateMerger tm = new TemplateMerger();
        Path file = Path.of("src/main/resources/template.txt");
        List<Employee> emp = List.of(new Employee("John",1980),new Employee("Jack",1990),new Employee("Jane",1995));

        System.out.println(tm.merge(file,emp));

    }



    }


