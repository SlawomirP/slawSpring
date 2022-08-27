package pl.SpringBootCourse.slawSpring.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import pl.SpringBootCourse.slawSpring.domain.Castle;
import pl.SpringBootCourse.slawSpring.domain.Knight;
import pl.SpringBootCourse.slawSpring.domain.Quest;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
@PropertySource("classpath:Castle.properties")
public class MainConfig {








//
//    @Bean
//    public Quest createQuest() {
//        return new Quest();
//    }
//
//
//    @Bean
//    public Knight knight() { // wczesniej nazwa to createKnight
//        Knight knight = new Knight("Lancelot", 29);
//        knight.setQuest(createQuest()); // wstrzyknieto beana
//        return knight;
//    }
//
//    @Bean(name = "zamek", initMethod = "momentAfterBeanCreate", destroyMethod = "momentBeforeDeleteBean")
//    @Value("${my.castle.name:slaw castle}")
//    public Castle castle(String name) {
//        Castle castle = new Castle(knight());
//        //ustawienie name, metoda wstrzykujaca
//        castle.setName(name);
//        return castle;
//    }

}
