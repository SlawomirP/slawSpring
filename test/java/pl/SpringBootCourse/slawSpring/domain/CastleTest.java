package pl.SpringBootCourse.slawSpring.domain;

import org.junit.jupiter.api.Test;
import pl.SpringBootCourse.slawSpring.domain.Castle;
import pl.SpringBootCourse.slawSpring.domain.Knight;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage(){
        //brakujace zadanie damy na sztywno
        Quest quest = new Quest();
        Knight knight = new Knight();
        //do knighta dodajemy questa metoda wstrzykujaca
        knight.setQuest(quest);
        Castle castle = new Castle(knight, "slaw castle");
        String except = "slaw castle <-- knight name: lancelot (29). Quest: save a princess";
        assertEquals(except, castle.toString());
    }
}
