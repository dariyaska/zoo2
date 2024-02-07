import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(" Zoo");

        Cage cage1 = new Cage(1, 100, 5);
        Cage cage2 = new Cage(2, 80, 3);

        Animal animal1 = new Animal("лев", true);
        Animal animal2 = new Animal("зебра", false);
        Animal animal3 = new Animal("слон", false);

        cage1.addAnimal(animal1);
        cage1.addAnimal(animal2);
        cage2.addAnimal(animal3);

        zoo.addCage(cage1);
        zoo.addCage(cage2);

        Cage selectedCage = zoo.getCages().get(0);
        System.out.println("Животные в клетке" + selectedCage.getNumber() + ":");
        for (Animal animal : selectedCage.getAnimals()) {
            System.out.println("имя: " + animal.getName() + ", Хищник: " + animal.isPredator());
        }
    }
}
