package classstructuremethods;

public class Client {
    String name;
    int year;
    String address;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void migrate(String newAddress) {
        address = newAddress;
    }
}
