package clone;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem sheetItem){
        employee= sheetItem.employee;
        project= sheetItem.project;
        from = sheetItem.from;
        to = sheetItem.to;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public static TimeSheetItem withDifferentDay(TimeSheetItem ts, LocalDate localDate) {
        TimeSheetItem modifiedSheetItem = new TimeSheetItem(ts);
        modifiedSheetItem.from = LocalDateTime.of(localDate, modifiedSheetItem.from.toLocalTime());
        modifiedSheetItem.to = LocalDateTime.of(localDate, modifiedSheetItem.to.toLocalTime());
        return modifiedSheetItem;
    }
}
