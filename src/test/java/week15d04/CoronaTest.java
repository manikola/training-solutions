package week15d04;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoronaTest {

    private Corona cd = new Corona();

    @Test
    public void readFileZest() throws IOException {
        Corona c = new Corona();
        Path path = Path.of("src/main/resources/corona.csv");
        List<String> result = c.readFile(path);

        assertEquals(3, result.size());
        assertEquals("2020-48", result.get(0));
        assertEquals("2020-49", result.get(1));
        assertEquals("2020-46", result.get(2));
    }
}
