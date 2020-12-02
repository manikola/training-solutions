package methodchain.robot;

public class Robot {

    private int distance;
    private int azimut;

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public Robot go(int meter) {
        this.distance = distance + meter;
        return this;
    }
    public Robot rotate(int angle) {
        this.azimut = azimut + angle;
        return this;
    }

}
