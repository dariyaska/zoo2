import java.util.ArrayList;
import java.util.List;
class Zoo {
    private String name;
    private List<Cage> cages;

    public Zoo(String name) {
        this.name = name;
        this.cages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Cage> getCages() {
        return cages;
    }

    public void addCage(Cage cage) {
        cages.add(cage);
    }

    public void removeCage(Cage cage) {
        cages.remove(cage);
    }

    public Animal findAnimalByName(String name) {
        for (Cage cage : cages) {
            for (Animal animal : cage.getAnimals()) {
                if (animal.getName().equals(name)) {
                    return animal;
                }
            }
        }
        return null;
    }
}

