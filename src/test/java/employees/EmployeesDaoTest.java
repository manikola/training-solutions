package employees;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {

    private EmployeesDao employeesDao;

    @BeforeEach
    public void init(){
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Cano not connect to database",se);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
       flyway.clean();
        flyway.migrate();


         employeesDao= new EmployeesDao(dataSource);
    }

    @Test
    void insertEmployee() {
        employeesDao.insertEmployee("Joan Doe");
        assertEquals(Arrays.asList("Joan Doe"), employeesDao.listEmployees());

    }

    @Test
    void testById(){

        long id = employeesDao.insertEmployeeAndGetGeneratedKey("Jane Doe");
        String name = employeesDao.findEmployeeById(id);

        assertEquals("Jane Doe", name);
    }

    @Test
    void testCreateEmployees(){
        employeesDao.createEmployees(Arrays.asList("Jack doe","Jane Doe", "Joe Doe"));
        List<String> names = employeesDao.listEmployees();

        assertEquals(Arrays.asList("Jack doe","Jane Doe", "Joe Doe"), names);
    }

    @Test
    void testCreateEmployeesRolledBack(){
        employeesDao.createEmployees(Arrays.asList("Jack doe","Jane Doe", "xJoe Doe"));
        List<String> names = employeesDao.listEmployees();

        assertEquals(Collections.emptyList(), names);
    }


}