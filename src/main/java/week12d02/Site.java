package week12d02;

public class Site {

    private boolean sideEven;
    private int length;
    private FenceType fenceType;

    public Site(boolean sideEven, int length, FenceType fenceType) {
        this.sideEven = sideEven;
        this.length = length;
        this.fenceType = fenceType;
    }

    public boolean isSideEven() {
        return sideEven;
    }

    public int getLength() {
        return length;
    }

    public FenceType getFenceType() {
        return fenceType;
    }
}
