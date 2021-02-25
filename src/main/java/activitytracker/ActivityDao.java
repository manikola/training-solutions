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

    public Activity saveActivity(Activity activity) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO activities(start_time, activity_desc, activity_type) VALUES(?,?,?);",Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            long id = executeAndGetGeneratedKey(stmt);
            return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());

        } catch (SQLException se) {
            throw new IllegalArgumentException("Can not insert", se);
        }

    }
    public void saveActivityAndSaveTrackPoints(Activity activity) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);

            int activityId = saveActivitywithTrackPoints(activity, conn);
            saveTrackPoints(activityId, activity, conn);

            conn.commit();

        } catch (Exception e) {
            throw new IllegalArgumentException("Transaction not succeeded!");
        }
    }

    private int saveActivitywithTrackPoints(Activity activity, Connection conn) throws Exception {
        int activityId = 0;
        try (PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?);", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                activityId = rs.getInt(1);
            }
            return activityId;
        } catch (Exception ex) {
            conn.rollback();
            throw new IllegalArgumentException("Invalid activity!");
        }
    }

    private void saveTrackPoints(int activityId, Activity activity, Connection conn) throws Exception {
        try (PreparedStatement stmt = conn.prepareStatement("insert into track_point(id, tp_time, lat, lon) values (?, ?, ?, ?);")) {
            for (TrackPoint t : activity.getTrackPoints()) {
                stmt.setInt(1, activityId);
                stmt.setDate(2, Date.valueOf(t.getTime()));
                stmt.setDouble(3, t.getLat());
                stmt.setDouble(4, t.getLon());

                stmt.executeUpdate();
            }
        } catch (Exception ex) {
            conn.rollback();
            throw new IllegalArgumentException("Invalid trackpoint(s)!");
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
                return rs.getLong(1);
            }
            else{
                throw new SQLException("No key has generated");
            }

        } catch (SQLException se) {
           throw new IllegalArgumentException("Error by insert");
        }
    }

    public Activity findActivityById(long id) {
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
