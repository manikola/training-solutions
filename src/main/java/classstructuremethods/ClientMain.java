package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John");
        client.setYear(1976);
        client.setAddress("London");

        System.out.println("Name: " + client.getName());
        System.out.println("Year: " + client.getYear());
        System.out.println("Address: " + client.getAddress());

        client.migrate("Dublin");
        System.out.println("New address: " + client.getAddress());
    }

}
