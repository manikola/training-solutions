package week05d04;

import java.time.LocalDate;

public class Product {

    private String name;

    private LocalDate dateOfExpire ;



    public Product(String name, int yearOfExpire, int monthOfExpire, int dayOfExpire) {
        this.name = name;
        dateOfExpire = LocalDate.of(yearOfExpire, monthOfExpire, dayOfExpire);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfExpire() {
        return dateOfExpire;
    }



}