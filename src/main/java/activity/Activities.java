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


    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        ActivityType activityType;
        for (int i = 0; i < ActivityType.values().length; i++) {
            activityType = ActivityType.values()[i];
            double distance = 0;
            for(Activity activity : activities) {
                if(activity.getType().equals(ActivityType.values()[i])) {
                    distance += activity.getDistance();
                }
            }
            reports.add(new Report(activityType,distance));
        }
        return reports;
    }


    }

