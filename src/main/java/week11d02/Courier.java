package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public Courier(List<Ride> rides) {
        this.rides = rides;
    }

    public Courier() {

    }

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride ride) {
        if (ride == null) {
            throw new IllegalArgumentException("No ride");
        }
        if (rides.size() < 1) {
            if (ride.getRideNumber() == 1) {
                rides.add(ride);
                return;
            } else {
                throw new IllegalArgumentException("Not the first ride");
            }

        } else {
            if (rides.get(rides.size() - 1).getDayNumber() > ride.getDayNumber()) {
                throw new IllegalArgumentException("Invalid day number");
            }
            if (rides.get(rides.size() - 1).getDayNumber() < ride.getDayNumber() && ride.getRideNumber() == 1) {
                rides.add(ride);
                return;
            }
            if (rides.get(rides.size() - 1).getDayNumber() == ride.getDayNumber() && rides.get(rides.size() - 1).getDayNumber() + 1 == ride.getRideNumber()) {
                rides.add(ride);
                return;
            }

            throw new IllegalArgumentException("Invalid ride number");

        }

    }
    public int getEarliestHoliday() {
        int firstHoliday = 0;
        for (int i = 1; i <= 7; i++) {
            for (Ride actual : rides) {
                if (i == actual.getDayNumber()) {
                    firstHoliday++;
                }

            }
            if (firstHoliday == 0) {
                return i;
            }
            firstHoliday = 0;
        }
        return -1;

}
}
