package pl.SpringBootCourse.slawSpring.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import pl.SpringBootCourse.slawSpring.domain.Castle;
import pl.SpringBootCourse.slawSpring.domain.Knight;
import pl.SpringBootCourse.slawSpring.domain.Quest;

@Configuration //TO OZNACZENIE MOWI ŻE ZNAJDUJĄ SIĘ TU DEFINICJE BEANÓW
//@ImportResource("classpath:config/castle-config.xml")
@PropertySource("classpath:Castle.properties")
public class MainConfig {



//    DEFINIOWANIE BEANÓW - definiujemy je za pomoca metod zwracajacych danego beana

    //zaczynamy definioanie od klasy quest to co zwroci ta metoda bedzie beanem
    //konieczna jest rowniez anotacja @Bean
    @Bean
    public Quest createQuest(){
        return new Quest();
    }

    //kolejnym beanem bedzie knight ktoremu wstrzymkujemy wart przez konstruktor
    //plus przez setera
    @Bean
    public Knight knight(){ // wczesniej nazwa to createKnight
        Knight knight = new Knight("Lancelot", 29);
        knight.setQuest(createQuest()); // wstrzyknieto beana
        return knight;
    }

    //bean castle ze wzgledu na to ze nazwa znajduje sie pliku
    //musi importowac xml, nad klasa nalezy dodac anotacje @ImportResource
    //bedziemy mieli beana tam zdefiniowanego
    //drugi sposób to: kreslamy skąd spring ma brac dane: anotacja @PropertySource
    //plus metody po i przed beamem
    @Bean(name="zamek", initMethod = "momentAfterBeanCreate", destroyMethod ="momentBeforeDeleteBean")
    @Value("${my.castle.name:slaw castle}")
    public Castle castle (String name){
        Castle castle = new Castle(knight());
        //ustawienie name, metoda wstrzykujaca
        castle.setName(name);
        return castle;
    }

}
