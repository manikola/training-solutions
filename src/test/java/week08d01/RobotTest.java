package week08d01;

import org.junit.jupiter.api.Test;
import week08d01.Robot;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {
    @Test
    public void robotTest(){
        Robot r = new Robot();

       Position p = r.move("JJBBBFFLLLL");
        assertEquals(-1,p.getX());
        assertEquals(-2,p.getY());
    }
}