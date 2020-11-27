package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String eMail;

    public User(String firstName, String lastName, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (!eMail.contains("@") || !eMail.contains(".")) {
            throw new IllegalArgumentException("e-mail format not valid!");
        }
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMail() {
        return eMail;
    }
    public String getFullName() {
        String fullName = getFirstName() + " " + getLastName();
        return fullName;


    }

    public static void main(String[] args) {
        User user = new User("Anikó", "Hegedüs", "manikola@yahoo.com");
        System.out.println(user.getFullName());

    }
}
