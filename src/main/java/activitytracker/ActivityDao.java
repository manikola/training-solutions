package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public long insertActivity(Activity activity) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO activities(start_time, activity_desc, activity_type) VALUES(?,?,?);",Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            return executeAndGetGeneratedKey(stmt);

        } catch (SQLException se) {
            throw new IllegalArgumentException("Can not insert", se);
        }

    }

    public List<Activity> activitiesBeforeDate(LocalDateTime date){
        List<Activity> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `activities` WHERE `start_time` < (?);")) {
            stmt.setTimestamp(1, Timestamp.valueOf(date));
            result = selectActivityByPreparedStatement(stmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not connect", sqle);
        }return result;

    }

    private long executeAndGetGeneratedKey(PreparedStatement stmt){
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if(rs.next()){
                return rs.getLong("id");
            }
            else{
                throw new SQLException("No key has generated");
            }

        } catch (SQLException se) {
           throw new IllegalArgumentException("Error by insert");
        }
    }

    public Activity findById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `activities` WHERE id = ?;")) {
            stmt.setLong(1, id);
            List<Activity> result = selectActivityByPreparedStatement(stmt);
            if(result.size() == 1){
                return result.get(0);
            }
            throw new IllegalArgumentException("Not found");

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not connect", sqle);
        }
    }

    private List<Activity> selectActivityByPreparedStatement(PreparedStatement stmt) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while(rs.next()) {
                Activity activity = new Activity(
                        rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);



            }
            return result;

        } catch (SQLException se) {
            throw new IllegalArgumentException("Execute failed", se);
        }

    }

    public List<Activity> selectAllActivities() {
        List<Activity> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `activities`")){
            return selectActivityByPreparedStatement(stmt);


        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not connect", sqle);
        }
    }

    public List<Activity> selectByType(ActivityType type) {
        List<Activity> results = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `activities` WHERE `activity_type`=?;")) {
            stmt.setString(1, type.toString());
            return selectActivityByPreparedStatement(stmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not connect", sqle);
        }

    }
}
