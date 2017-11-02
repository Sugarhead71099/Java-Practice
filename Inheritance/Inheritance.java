package Inheritance;

/**
 * Created by braij on 4/5/2017.
 */
public class Inheritance {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", true, true, (short) 5, (short) 5, (short) 2);
        animal.eat();

        Dog dog = new Dog("Yorkie", (short) 8, (short) 20, (short) 4, (short) 42, true, "long silky");
        dog.eat();
    }

}
