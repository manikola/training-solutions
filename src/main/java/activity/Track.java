package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint point) {
        trackPoints.add(point);

    }

    public double getFullElevation() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() > trackPoints.get(i - 1).getElevation()) {
                sum = sum + (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation());
            }
        }
        return (double) sum;
    }

    public double getFullDecrease() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() < trackPoints.get(i - 1).getElevation()) {
                sum = sum + (trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation());
            }
        }
        return (double) sum;
    }

    public double getDistance() {
        double sum = 0.0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            sum += trackPoints.get(i).getDistanceFrom(trackPoints.get(i + 1));

        }

        return sum;

    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = Double.MIN_VALUE;
        double minLongitude = Double.MIN_VALUE;
        Coordinate minCoordinate = new Coordinate(minLatitude, minLongitude);

        for (TrackPoint item : trackPoints) {
            if (minCoordinate.getLatitude() == 0 || (item.getCoordinate().getLatitude() < minCoordinate.getLatitude())) {
                minLatitude = item.getCoordinate().getLatitude();
            }
            if (minCoordinate.getLongitude() == 0 || (item.getCoordinate().getLongitude() < minCoordinate.getLongitude())) {
                minLongitude = item.getCoordinate().getLongitude();

            }
        }
        return new Coordinate(minLatitude, minLongitude);

    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLongitude = trackPoints.get(0).getCoordinate().getLongitude();
        Coordinate maxCoordinate = new Coordinate(maxLatitude, maxLongitude);

        for (TrackPoint item : trackPoints) {
            if (maxCoordinate.getLatitude() == 0 || (maxCoordinate.getLatitude() < item.getCoordinate().getLatitude())) {
                maxLatitude = item.getCoordinate().getLatitude();
            }
            if (maxCoordinate.getLongitude() == 0 || (item.getCoordinate().getLongitude() > maxCoordinate.getLongitude())) {
                maxLongitude = item.getCoordinate().getLongitude();

            }
        }
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public double getRectangleArea() {
        double x = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();
        double y = findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude();

            return x * y;

        }
    }

















