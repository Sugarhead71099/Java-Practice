package Methods;

/**
 * Created by braij on 4/4/2017.
 */
public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(49));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0d && (inches >= 0d && inches <= 12d)) {
            double feetToCentimeters = (feet * 12d) * 2.54;
            double inchesToCentimeters = inches * 2.54;
            return feetToCentimeters + inchesToCentimeters;
        }
        System.out.println("Invalid feet or inches parameter");
        return -1d;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            int inchesToFeet = (int) inches / 12;
            double leftOverInches = inches % 12;
            return calcFeetAndInchesToCentimeters(inchesToFeet, leftOverInches);
        }
        System.out.println("Invalid inches");
        return -1d;
    }

}
