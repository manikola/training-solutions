package week08d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week08d02.senior.CountryStatistics;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatisticsTest {


    @Test
    public void testMaxPopulation() {
        CountryStatistics cs = new CountryStatistics();
        cs.readFile(Path.of("countries.txt"));
        Assertions.assertEquals("Kongoi_Demokratikus_Koztarsasag 79 3 9", cs.maxPopulation());
    }
}