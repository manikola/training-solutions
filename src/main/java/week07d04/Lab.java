package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this(title);
        this.completedAt = completedAt;
        this.completed = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public void complete(LocalDate date) {
         completed = true;
         completedAt = date;
    }

    public void complete() {
        completed = true;
        completedAt = LocalDate.now();
           }


    @Override
    public String toString() {
        return "Title='" + title + '\'' +
                ", completed=" + completed +
               ", completedAt: " + completedAt;
   }



}
