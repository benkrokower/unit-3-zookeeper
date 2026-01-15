import java.util.Random;

public class Animal {

    // private instance variable called animalType
    private String animalType;

    // static counter for how many Animals were instantiated
    private static int count = 0;

    // no-argument constructor: random animal type
    public Animal() {
        this(randomAnimalType()); // constructor chaining
    }

    // constructor with animal type parameter
    public Animal(String animalType) {
        this.animalType = animalType;
        count++;
    }

    // static accessor for count
    public static int getCount() {
        return count;
    }

    // getter
    public String getAnimalType() {
        return animalType;
    }

    // setter
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    // returns a sound based on animalType
    public String speak() {
        if (animalType == null) {
            return "...";
        }

        if (animalType.equals("Lion")) {
            return "Roooooaaaar!";
        } else if (animalType.equals("Tiger")) {
            return "Grrrrrr!";
        } else if (animalType.equals("Bear")) {
            return "GRAAAAH!";
        } else if (animalType.equals("Giraffe")) {
            return "Munch munch!";
        } else if (animalType.equals("Penguin")) {
            return "Honk!";
        } else {
            return "???";
        }
    }

    // reverse the result of speak()
    public String speakBackward() {
        String sound = speak();
        String reversed = "";

        for (int i = sound.length() - 1; i >= 0; i--) {
            reversed += sound.substring(i, i + 1);
        }

        return reversed;
    }

    @Override
    public String toString() {
        return animalType + " says \"" + speak() + "\"";
    }

    // helper: generate a random type using only Strings (no arrays)
    private static String randomAnimalType() {
        Random rand = new Random();
        int choice = rand.nextInt(5);

        if (choice == 0) {
            return "Lion";
        } else if (choice == 1) {
            return "Tiger";
        } else if (choice == 2) {
            return "Bear";
        } else if (choice == 3) {
            return "Giraffe";
        } else {
            return "Penguin";
        }
    }
}
