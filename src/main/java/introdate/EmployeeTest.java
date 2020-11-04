package introdate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(2016,1,29, "Ancsa");
        System.out.println(employee.getName());
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
    }
}
