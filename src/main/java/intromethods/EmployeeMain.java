package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("James Barker", 2007, 200000);
        Employee employee2 = new Employee("John Doe", 2016, 250000);
        Employee employee3 = new Employee("Jane Doe", 2018, 280000);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee2.toString());

        employee1.raiseSalary(80000);
        System.out.println(employee1);

        employee3.setName("Jack Doe");
        System.out.println("Name: " + employee3.getName());
        System.out.println("Hiring year: " + employee3.getHiringYear());
        System.out.println("Salary: " + employee3.getSalary());
    }
}
