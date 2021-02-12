package week15d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfThronesTest {

    @Test
    public void readFromFileTest(){
        try(BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/battles.csv"))){
            GameOfThrones gt = new GameOfThrones();
            Map<String,Integer> result = gt.readFromFile(br);


            assertEquals(21,result.size());
            assertEquals("Lannister", gt.getMostViolentHouse(result));

        }catch (IOException e) {
            throw new IllegalStateException("Can not find file",e);
        }
    }
}
