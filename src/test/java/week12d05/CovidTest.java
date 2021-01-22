package week12d05;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CovidTest {

    @Test
    void testWordCounter() {
        Covid covid = new Covid();
        Path file = Path.of("src/main/resources/index.html");
        int counter = covid.wordCounter("koronavírus", file);
        assertEquals(11,counter);
    }

}
