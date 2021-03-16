package week13d01.senior;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CitySeniorTest {

    @Test
    void readFromFile() {
        try(BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/iranyitoszamok-varosok-2021.csv"))){
            CitySenior c = new CitySenior();
            System.out.println(c.readFromFile(br));
            assertEquals("Aba=8127", c.readFromFile(br).toString());

        }catch (IOException e) {
            throw new IllegalStateException("Can not find file",e);
        }
    }
}