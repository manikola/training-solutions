package week12d02;

public class SiteStatistic {

    private int count;
    private FenceType  fenceType;


    public SiteStatistic(FenceType fenceType) {
        this.count = 1;
        this.fenceType = fenceType;
    }

    public int getCount() {
        return count;
    }

    public FenceType getFenceType() {
        return fenceType;
    }
    public void increaseCount() {
        count++;
    }

}
