package pl.SpringBootCourse.slawSpring.domain;

public class Knight {

    private String name;
    private int age;
//stworzenie pola z obiektem 2
    private Quest quest;


    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
        this.quest = new Quest("save a princess"); //4
    }

    @Override
    public String toString(){
        return "knight name: " + name + " (" + age + "). Quest: " + quest;
    }
}
