package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public List<Flight> getFlights() {
        return flights;
    }

    public void readFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(" ");
                String[] time = arr[3].split(":");
                int timeHour = Integer.parseInt(time[0]);
                int timeMinute = Integer.parseInt(time[1]);
                flights.add(new Flight(arr[0], FlightType.valueOf(arr[1].toUpperCase()), arr[2], LocalTime.of(timeHour, timeMinute)));

            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public FlightType whatsMore() {
        int countArrival = 0;
        int countDeparture = 0;
        for (Flight item : flights) {
            if (item.getFlightType() == FlightType.ARRIVAL) {
                countArrival++;

            } else {
                countDeparture++;
            }
        }
        if (countArrival >= countDeparture) {
            return FlightType.ARRIVAL;
        }
        return FlightType.DEPARTURE;
    }


    public Flight getByFlightNumber(String flightNumber) {
        for (Flight item : flights) {
            if (item.getFlightNumber().equals(flightNumber)) {
                return item;
            }

        }
        throw new IllegalArgumentException("Can not find flight");
    }

    public List<Flight> findFlightsToFrom(String city, FlightType flightType) {
        List<Flight> report = new ArrayList<>();
        for (Flight item : flights) {
            if (item.getCity().equals(city) && item.getFlightType() == flightType) {
                report.add(item);
            }
        }
        return report;
    }

    public Flight getEarliestDepartureFlight() {
        LocalTime time = LocalTime.of(23,59);
        Flight earliest = flights.get(0);
        for (Flight item : flights) {
            if (item.getTime().isBefore(time) && item.getFlightType() == FlightType.DEPARTURE) {
                time = item.getTime();
                earliest = item;
            }
        }
        return earliest;


    }

    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/timetable.txt");
        Airport airport = new Airport();
        airport.readFile(path);

        System.out.println(airport.flights);
        System.out.println(airport.whatsMore());
    }


}
