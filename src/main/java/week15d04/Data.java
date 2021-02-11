package week15d04;

public class Data implements Comparable<Data> {

    private String week;
    private int cases;

    public Data(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public int compareTo(Data other) {
        return Integer.valueOf(this.cases).compareTo(other.cases);
    }

    @Override
    public String toString() {
        return "Data{" +
                "week='" + week + '\'' +
                ", cases=" + cases +
                '}';
    }
}