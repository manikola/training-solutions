package abstractclass.gamecharacter;

import static java.lang.Math.sqrt;

public class Point {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point point) {
        return (long) Math.sqrt(Math.pow(x-point.getX(),2) + Math.pow(y-point.getY(),2));
    }
}
