package pl.SpringBootCourse.slawSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.SpringBootCourse.slawSpring.domain.Castle;


@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

    }
}
