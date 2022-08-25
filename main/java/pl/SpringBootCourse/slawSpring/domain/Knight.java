package pl.SpringBootCourse.slawSpring.domain;

public class Knight {

    private String name;
    private int age;
    //stworzenie pola z obiektem 2
    private Quest quest; // z powodu tego pola klasa knight jest zalezna
    //od klasy Quest i na odwrot

    //krok 6 zamiast ustawiac quest w konstruktorze, robimy tak zaeby byl przekazywany
    //z nadrzednej klasy, wrzucamy to w parametry
    public Knight(String name, int age, Quest quest) {
        this.name = name;
        this.age = age;
//        this.quest = new Quest("save a princess"); //4
        this.quest = quest;
    }

    //krok 10 - dodajemy nowy konstruktor dodajacy imie i wiek
    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //krok 9 - drugi typ wstrzykiwania - przez metode (najczesciej seter)
    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "knight name: " + name + " (" + age + "). Quest: " + quest;
    }
}
