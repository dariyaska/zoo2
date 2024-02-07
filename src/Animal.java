

class Animal {
    private String name;
    private boolean predator;
    private Cage cage;

    public Animal(String name, boolean predator) {
        this.name = name;
        this.predator = predator;
    }

    public String getName() {
        return name;
    }

    public boolean isPredator() {
        return predator;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }
}