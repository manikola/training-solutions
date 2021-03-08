package employees;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesMain {







    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        EmployeesDao employeesDao= new EmployeesDao(dataSource);
        employeesDao.insertEmployee("Jane Doe");
        List<String> names = employeesDao.listEmployees();
        System.out.println(names);
        System.out.println(employeesDao.findEmployeeById(5));







    }


}
