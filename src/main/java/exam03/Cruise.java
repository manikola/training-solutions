package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice = 100_000.0;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = 100_000.0;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() < boat.getMaxPassengers()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("Boat is already full");
        }


    }

    public double getPriceForPassenger(Passenger passenger) {
        return (basicPrice * passenger.getCruiseClass().getMultiplier());
    }

    public Passenger findPassengerByName(String name) {
        Passenger result = null;
        for (Passenger item : passengers) {
            if (item.getName().equals(name)) {
                result = item;
            }
        }
        return result;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> alphabeticalList = new ArrayList<>();
        for (Passenger item : passengers) {
            alphabeticalList.add(item.getName());
        }
        Collections.sort(alphabeticalList);
        return alphabeticalList;
    }

    public double sumAllBookingsCharged() {
        double incomeSum = 0;
        for (Passenger item : passengers) {
            incomeSum += getPriceForPassenger(item);
        }
        return incomeSum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> statistics = new HashMap<>();
        for (Passenger item: passengers) {
            CruiseClass key = item.getCruiseClass();
            if (statistics.containsKey(key)) {
                int value = statistics.get(key);
                statistics.put(key, value + 1);
            } else {
                statistics.put(key, 1);
            }
        }
        return statistics;

    }
}
