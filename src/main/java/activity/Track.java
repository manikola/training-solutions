package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
        return sum;
    }

    public double getDistance() {
        double sum = 0.0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            sum += trackPoints.get(i).getDistanceFrom(trackPoints.get(i + 1));

        }

        return sum;

    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double minLongitude = trackPoints.get(0).getCoordinate().getLongitude();


        for (TrackPoint item : trackPoints) {
            if (item.getCoordinate().getLatitude() <minLatitude) {
                minLatitude = item.getCoordinate().getLatitude();
            }
            if (item.getCoordinate().getLongitude() < minLongitude) {
                minLongitude = item.getCoordinate().getLongitude();

            }
        }
        return new Coordinate(minLatitude, minLongitude);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLongitude = trackPoints.get(0).getCoordinate().getLongitude();


        for (TrackPoint item : trackPoints) {
            if ((maxLatitude< item.getCoordinate().getLatitude())) {
                maxLatitude = item.getCoordinate().getLatitude();
            }
            if (item.getCoordinate().getLongitude() > maxLongitude) {
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

    public void loadFromGpx(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            String newLine;
            double lat = 0.0;
            double lon = 0.0;
            double ele = 0.0;

            while ((line = reader.readLine()) != null) {
                if (line.contains("<trkpt")) {
                    lat = Double.parseDouble(line.substring(15, 25));
                    lon = Double.parseDouble(line.substring(32, 42));

                    newLine = reader.readLine();

                    ele = Double.parseDouble(newLine.substring(9, 14));
                    trackPoints.add(new TrackPoint(new Coordinate(lat, lon), ele));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }


    }
}

















