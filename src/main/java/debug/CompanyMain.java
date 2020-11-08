package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jason Taylor", 1970);
        Employee employee2 = new Employee("Jason Donelly", 1978);
        Employee employee3 = new Employee("David Jeffcock", 1980);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        Employee jack = company.findEmployeeByName("Jason Taylor");
        System.out.println(jack.getName() + " " + jack.getYearOfBirth());

        List<String> names = company.listEmployeeNames();
        System.out.println(names);
    }
}
