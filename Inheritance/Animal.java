package Inheritance;

/**
 * Created by braij on 4/5/2017.
 */
public class Animal {

    // Instance Fields
    private String name;
    short size, weight, numEyes;
    boolean brain, body;

    // Constructor
    public Animal(String name, boolean brain, boolean body, short size, short weight, short numEyes) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.numEyes = numEyes;
    }

    // Getters
    public String getName() { return name; }

    public boolean getBrain() { return brain; }

    public boolean getBody() { return body; }

    public short getSize() { return size; }

    public short getWieght() { return weight; }

    public short getNumEyes() { return numEyes; }

    // Other Methods
    public void eat() {
        System.out.println("MUNCH Munch munch... ANIMAL!");
    }
}