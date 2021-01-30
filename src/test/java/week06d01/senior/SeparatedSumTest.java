package week06d01.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SeparatedSumTest {

    private String numberString;

    @BeforeEach
    public void setUp() {
        SeparatedSum ss = new SeparatedSum();
        numberString = "12,13;-14,15;-15,16;16,17;-20,18;18,19";
    }

    @Test
    public void sumNumbers() {
        SeparatedSum ss = new SeparatedSum();
        numberString = "12,13;-14,15;-15,16;16,17;-20,18;18,19";
        assertEquals("[46.49000000000001, -49.49]", Arrays.toString(ss.separatedSum(numberString)));
    }


}