package week09d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {

    private List<Person> people;
    private SantaClaus santaClaus;

    @BeforeEach
    public void init(){
        people = List.of(new Person("John",15));
        santaClaus = new SantaClaus(people);
    }

    @Test
    public void testChimneys() {
        assertEquals(1, santaClaus.getPersons().size());
    }




}
