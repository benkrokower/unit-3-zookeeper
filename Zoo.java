public class Zoo {

    // 3 private instance variables of type Cage (declared only)
    private Cage cageA;
    private Cage cageB;
    private Cage cageC;

    // no-argument constructor: populate each cage with a random animal
    public Zoo() {
        cageA = new Cage();
        cageB = new Cage();
        cageC = new Cage();
    }

    // overloaded constructor: demonstrates constructor overloading
    public Zoo(Animal a1, Animal a2, Animal a3) {
        this(); // initialize cages first
        cageA.setAnimal(a1);
        cageB.setAnimal(a2);
        cageC.setAnimal(a3);
    }

    // returns the total number of Animals ever created (class-level count)
    public int howManyAnimals() {
        return Animal.getCount();
    }

    // replace animal only if the Cage belongs to THIS zoo
    public boolean putAnimalInCage(Cage cage, Animal animal) {
        if (cage == null || animal == null) {
            return false;
        }

        if (cage == cageA) {
            cageA.setAnimal(animal);
            return true;
        } else if (cage == cageB) {
            cageB.setAnimal(animal);
            return true;
        } else if (cage == cageC) {
            cageC.setAnimal(animal);
            return true;
        }

        return false;
    }

    // optional accessors (useful for driver code / testing)
    public Cage getCageA() { return cageA; }
    public Cage getCageB() { return cageB; }
    public Cage getCageC() { return cageC; }

    @Override
    public String toString() {
        return "Zoo Report\n"
                + "----------\n"
                + "Cage A: " + cageA + "\n"
                + "Cage B: " + cageB + "\n"
                + "Cage C: " + cageC + "\n"
                + "Animals created (all-time): " + howManyAnimals();
    }
}
