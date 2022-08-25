package pl.SpringBootCourse.slawSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.SpringBootCourse.slawSpring.domain.Castle;
import pl.SpringBootCourse.slawSpring.domain.Knight;
import pl.SpringBootCourse.slawSpring.domain.Quest;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        Quest saveAPrincess = new Quest("Save a princess");
        Knight lancelot = new Knight("Lancelot", 29, saveAPrincess);
        System.out.println(lancelot);


        Quest killTheDragon = new Quest("Kill the dragon.");
        Knight percival = new Knight("Percival", 31, killTheDragon);
        System.out.println(percival);

        //krok 11 - przyklad wstrzykiwania przez metode
        Knight percival2konstruktor = new Knight("Percival2", 31);
        System.out.println(percival2konstruktor);

        percival2konstruktor.setQuest(killTheDragon);
        System.out.println(percival2konstruktor);
    }
}
