package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity item) {
        activities.add(item);

    }

    public int numberOfTrackActivities() {
        int count = 0;
        for (Activity item : activities) {
            if (item instanceof ActivityWithTrack) {
                count++;
            }

        }
        return count;
    }
    public int numberOfWithoutTrackActivities() {
        int count = 0;
        for (Activity item : activities) {
            if (item instanceof ActivityWithoutTrack) {
                count++;
            }

        }
        return count;
    }
    public double getBikingDistance() {
        double bikingDistance = 0;
        for (Activity item : activities) {
            if (item.getType() == ActivityType.BIKING) {
                bikingDistance += item.getDistance();
            }
        }
        return bikingDistance;
    }
    public double getHikingDistance() {
        double hikingDistance = 0;
        for (Activity item : activities) {
            if (item.getType() == ActivityType.HIKING) {
                hikingDistance += item.getDistance();
            }
        }
        return hikingDistance;
    }
    public double getRunningDistance() {
        double runningDistance = 0;
        for (Activity item : activities) {
            if (item.getType() == ActivityType.RUNNING) {
                runningDistance += item.getDistance();
            }
        }
        return runningDistance;
    }
    public double getBasketballDistance() {
        double basketballDistance = 0;
        for (Activity item : activities) {
            if (item.getType() == ActivityType.BASKETBALL) {
                basketballDistance += item.getDistance();
            }
        }
        return basketballDistance;
    }

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        for (Activity item : activities) {
            reports.add(new Report(ActivityType.BIKING, getBikingDistance()));
            reports.add(new Report(ActivityType.HIKING, getHikingDistance()));
            reports.add(new Report(ActivityType.RUNNING, getRunningDistance()));
            reports.add(new Report(ActivityType.BASKETBALL, getBasketballDistance()));
        }
        return reports;
    }


    }

