package pl.SpringBootCourse.slawSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.SpringBootCourse.slawSpring.domain.Knight;
import pl.SpringBootCourse.slawSpring.domain.Quest;

//utworzenie pierwszej klasy z implementacja CommandLineRunner
//interfejs ze springa z metoda run

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // krok 7 - tu ustawiamy nowy obiekt questa

        Quest saveAPrincess = new Quest("Save a princess");
       // stworzenie nowego obiektu knight 1
        Knight lancelot = new Knight("Lancelot", 29, saveAPrincess);

        System.out.println(lancelot);

        //krok 8
        Quest killTheDragon = new Quest("Kill the dragon.");
        //stworzenie kolejnego rycerz 5, on ma miec inny quest
        //problemem jest ze quest w klasie Knight jest ustawiony "sztywno"
        Knight percival = new Knight("Percival", 31, killTheDragon);
        System.out.println(percival);

        //krok 11 - przyklad wstrzykiwania przez metode
        Knight percival2konstruktor = new Knight("Percival2", 31);
        System.out.println(percival2konstruktor);

        percival2konstruktor.setQuest(killTheDragon);
        System.out.println(percival2konstruktor);

    }
}
