package statements;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getInMinutes(){
        int hourInMinutes = 60;
        return hour * hourInMinutes + minute;
    }

    public int getInSeconds(){
        int minuteInSeconds = 60;
        return getInMinutes() * minuteInSeconds + second;
    }

    public boolean earlierThan(Time other){
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds < otherTimeInSeconds;
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }

}
