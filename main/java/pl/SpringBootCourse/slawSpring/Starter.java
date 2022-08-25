package pl.SpringBootCourse.slawSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.SpringBootCourse.slawSpring.domain.Knight;

//utworzenie pierwszej klasy z implementacja CommandLineRunner
//interfejs ze springa z metoda run

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
       // stworzenie nowego obiektu knight 1
        Knight lancelot = new Knight("Lancelot", 29);

        System.out.println(lancelot);

    }
}
