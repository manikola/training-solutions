package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
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

    public static void main(String[] args) {

        Lab lab = new Lab("Methods");
        Lab lab1 = new Lab("Inheritance");
        Lab lab2 = new Lab("Abstract");



        lab.complete(LocalDate.of(2020, 10,12));
        System.out.println(lab.toString());
        lab1.complete();
        System.out.println(lab1.toString());
        lab2.complete();
        System.out.println(lab2.toString());
    }



}
