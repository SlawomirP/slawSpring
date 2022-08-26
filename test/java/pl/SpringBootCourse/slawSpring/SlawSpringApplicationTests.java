package pl.SpringBootCourse.slawSpring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.SpringBootCourse.slawSpring.domain.Castle;
import pl.SpringBootCourse.slawSpring.domain.Knight;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlawSpringApplicationTests {

	@Autowired
	Knight knight;
	@Autowired
	Castle castle;
	@Test
	void contextLoads() {
	}

	//przetestowanie klasy toString
	@Test

	public void testCastle(){
		String except = "slaw castle <-- knight name: lancelot (29). Quest: save a princess";
		//potrzebny jest obiekt klasy Knight, wstrzykniemy go - dodamy pole z zdn autowired
		//po utworzeniu pola wstrzykujemy przez konstruktor obiekt Knight
		//obiekt castle rowniez powinien zostac wstrzykniety poniewaz nowy castle nie bedzie tworzony
		//z pliku Castle.properties
//		Castle castle = new Castle(knight);
		assertEquals(except, castle.toString());
	}

	//DRUGA METODA TESTU, - pierwsza metoda jest dluga, powstaje caly kontekst springowy
	//dlatego budowanie klas musi sie sprowadzac do tego aby mozna bylo wstrzykiwac zaleznosci
	//przez konstruktor lub metode wstrzykujaca bez uzycia kontekstu springa
	 // test w nowej klasie CastleTest
}
