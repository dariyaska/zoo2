import java.util.ArrayList;
import java.util.List;
class Cage {
    private int number;
    private int size;
    private int maxAnimalCount;
    private List<Animal> animals;

    public Cage(int number, int size, int maxAnimalCount) {
        this.number = number;
        this.size = size;
        this.maxAnimalCount = maxAnimalCount;
        this.animals = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public int getSize() {
        return size;
    }

    public int getMaxAnimalCount() {
        return maxAnimalCount;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animal.setCage(this);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        animal.setCage(null);
    }

    public int getCurrentAnimalCount() {
        return animals.size();
    }
}
