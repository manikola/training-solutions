package exam03;

import org.junit.jupiter.api.Test;

public class BoatTest {

    @Test
    void create() {
        Boat boat = new Boat("WetDreams", 15);
        assertEquals("WetDreams", boat.getName());
        assertEquals(15, boat.getMaxPassengers());
    }
}
