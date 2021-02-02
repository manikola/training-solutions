package week07d03.senior;

public class Date {

    private final int year;
     private final int month;
    private final int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public static Date of (int year,int month, int day) {
        return new Date(year, month, day);
    }
    public Date withYear(int year) {
        return new Date(year, getMonth(), getDay());
    }
    public Date withMonth(int month) {
    return new Date(getYear(),month, getDay());
    }
    public Date withDay(int day) {
        return new Date(getYear(), getMonth(), day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

//Készítsünk egy Date osztályt, mely az alábbi attribútumokkal rendelkezik: int year, int month, int day.
// Az összes attribútum legyen final! Készítsünk továbbá egy statikus of metódust, mely a year, month és day
// paramétereket várja és létrehoz egy Date objektumot ezek alapján. Legyen továbbá a Date-nek egy withYear(int year),
// withMonth(int month) és egy withDay(int day) metódusa, melyek egy új Date objektumot adnak vissza
// az eredeti Date objektum adataival, azzal a különbséggel, hogy az új objektum a megadott paraméter értékét
// tartalmazza a megfelelő helyen (year, month vagy day).
