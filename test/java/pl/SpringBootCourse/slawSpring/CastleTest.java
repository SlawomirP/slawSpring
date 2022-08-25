package pl.SpringBootCourse.slawSpring;

import org.junit.jupiter.api.Test;
import pl.SpringBootCourse.slawSpring.domain.Castle;
import pl.SpringBootCourse.slawSpring.domain.Knight;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage(){
        Knight knight = new Knight();
        Castle castle = new Castle(knight);
        String except = "slaw castle <-- knight name: lancelot (29). Quest: save a princess";
        assertEquals(except, castle.toString());
    }
}
