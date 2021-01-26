package week13d02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirportTest {


    @Test
    void readFile() {
        Airport a = new Airport();
        a.readFile(Path.of("src/main/resources/timetable.txt"));
        assertEquals(100, a.getFlights().size());

    }

    @Test
    void whatsMore() {
        Airport a = new Airport();
        a.readFile(Path.of("src/main/resources/timetable.txt"));

        assertEquals(FlightType.DEPARTURE, a.whatsMore());
    }

    @Test
    void getFlightByNumber() {
        Airport a = new Airport();
        a.readFile(Path.of("src/main/resources/timetable.txt"));

        assertEquals("Budapest", a.getByFlightNumber("SW1667").getCity());
        //100.
        assertEquals(LocalTime.of(9,35), a.getByFlightNumber("MN5047").getTime());
    }

    @Test
    void findFlights() {
        Airport a = new Airport();
        a.readFile(Path.of("src/main/resources/timetable.txt"));

        assertEquals(3, a.findFlightsToFrom("Budapest", FlightType.ARRIVAL).size());
        assertEquals(2, a.findFlightsToFrom("Moscow", FlightType.DEPARTURE).size());

    }

    @Test
    void getEarliestFlight() {
        Airport a = new Airport();
        a.readFile(Path.of("src/main/resources/timetable.txt"));

        assertEquals("FG3210 DEPARTURE Zurich 06:16", a.getEarliestDepartureFlight().toString());
    }
}
