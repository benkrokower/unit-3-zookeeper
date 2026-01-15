public class Cage {

    // private instance variable of type Animal
    private Animal animal;

    // no-argument constructor: random animal
    public Cage() {
        this(new Animal()); // constructor chaining
    }

    // constructor that takes an Animal parameter
    public Cage(Animal animal) {
        this.animal = animal;
    }

    // accessor
    public Animal getAnimal() {
        return animal;
    }

    // mutator
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Cage holding -> " + animal;
    }
}
