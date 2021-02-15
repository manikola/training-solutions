package week16d01;

import java.time.Duration;
import java.time.LocalDateTime;

public class CanoeRental implements Comparable<CanoeRental> {

    String name;
    CanoeType canoeType;
    LocalDateTime startTime;
    LocalDateTime endTime;

    public CanoeRental(String name, CanoeType canoeType, LocalDateTime startTime) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum() {
        LocalDateTime closing = endTime;
        if (closing == null) {
            closing = LocalDateTime.now();
        }
        return Duration.between(startTime, closing).toHours();
    }

    @Override
    public String toString() {
        return name + " " + canoeType + " " + startTime + " " + endTime;
    }


    @Override
    public int compareTo(CanoeRental o) {
        return (int) Duration.between(startTime,o.startTime).toMinutes();
    }
}
