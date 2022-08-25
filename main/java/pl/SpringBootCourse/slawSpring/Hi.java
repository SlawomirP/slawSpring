package pl.SpringBootCourse.slawSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//utworzenie pierwszej klasy z implementacja CommandLineRunner
//interfejs ze springa z metoda run

@Component
public class Hi implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("sample text");
    }
}
