package Inheritance;

/**
 * Created by braij on 4/5/2017.
 */
public class Dog extends Animal {

    private short legs, teeth;
    private boolean tail;
    private String coatType;

    public Dog(String name, short size, short weight, short legs, short teeth, boolean tail, String coatType) {
        super(name, true, true, size, weight, (short) 2);
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coatType = coatType;
    }

    @Override
    public void eat() {
        System.out.println("NUM Num num... BARK!");
    }
}
