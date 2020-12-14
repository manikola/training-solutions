package week08d01;

public class Position {
    private int x;
    private int y;

    public Position() {
        x = 0;
        y = 0;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveJ() {
        ++x;
    }

    public void moveB() {
        --x;
    }

    public void moveF() {
        ++y;
    }

    public void moveL() {
        --y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
