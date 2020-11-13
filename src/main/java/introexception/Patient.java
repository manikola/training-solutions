package introexception;

public class  Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Név kitöltése kötelező!");
        }
        this.name = name;

        if (!new SsnValidator().isValidSsn(socialSecurityNumber))
            throw new IllegalArgumentException("Invalid Social Security Number: " + socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber;
        if (yearOfBirth <= 1900) {
            throw new IllegalArgumentException("Születési év" + yearOfBirth + "érvénytelen!");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
