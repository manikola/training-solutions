package week05d04.senior;

public enum Currency {

    HUF("HUF"), USD("USD");

    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
