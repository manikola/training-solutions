package week11d04.senior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameLengthTest {

    @Test
    void getLengths() {
        NameLength nl = new NameLength();
        List<String> names = List.of("Joe", "Jack", "Jane", "Jake", "George", "William");

        assertEquals("[3, 4]", nl.getLengths(names).toString());
    }
}