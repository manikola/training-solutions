package activity;

public class TrackPoint {

    private Coordinate coordinate;
    private double elevation;
    final double RADIUS = 6371;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }
    public double getDistanceFrom(TrackPoint point) {
        double latDistance = Math.toRadians(point.getCoordinate().getLatitude() - this.coordinate.getLatitude());
        double lonDistance = Math.toRadians(point.getCoordinate().getLongitude() - this.coordinate.getLongitude() );
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(this.coordinate.getLatitude())) * Math.cos(Math.toRadians(point.getCoordinate().getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = RADIUS * c * 1000; // convert to meters

        double height = this.elevation - point.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}
