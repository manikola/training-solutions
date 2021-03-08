package employees;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertEmployee(String name){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees(emp_name) VALUES(?);")) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert",se);
        }
    }

    public long insertEmployeeAndGetGeneratedKey(String name){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees(emp_name) VALUES(?);",Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, name);
            stmt.executeUpdate();

            return extracted(stmt);

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert",se);
        }
    }

    private long extracted(PreparedStatement stmt)  {
        try(ResultSet rs = stmt.getGeneratedKeys()){
            if(rs.next()){
                return rs.getLong(1);
            }
            throw new IllegalStateException("can not get id");
        }
        catch (SQLException se){
            throw new IllegalStateException("can not get id",se);
        }
    }


    public List<String> listEmployees(){
        try(Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT emp_name FROM `employees`;")){
            List<String> names = new ArrayList<>();
            while(rs.next()){
                names.add(rs.getString("emp_name"));
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Can not select employees",se);
        }
    }

    public String findEmployeeById(long id){
        try (Connection conn = dataSource.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("SELECT emp_name FROM `employees` WHERE id = ?;")) {
                stmt.setLong(1, id);

                return selectNameByPreparedStatement(stmt);


            } catch (SQLException se) {
                throw new IllegalStateException("can not query", se);
            }
        }

    private String selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                return name;
            }
            throw new IllegalArgumentException("No data found");

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot query",se);
        }
    }

    public void createEmployees(List<String> names){
        try (  Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);

           try( PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees(emp_name) VALUES(?);")){
               for(String item :names){
                   if(item.startsWith("x")){
                       throw new IllegalArgumentException("Name invalid");
                   }
                   stmt.setString(1, item);
                   stmt.executeUpdate();
               }
               conn.commit();
           }
           catch (IllegalArgumentException iae){
    conn.rollback();
            }


        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert",se);
        }
    }








    }


