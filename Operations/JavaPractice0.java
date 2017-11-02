package Operations;

/**
 * Created by braij on 4/4/2017.
 */
public class JavaPractice0 {
    public static void main(String[] args) {
        double variable0 = 20d;
        double variable1 = 80d;
        double sum = (variable0 + variable1) * 25;
        System.out.println("My total = " + sum);
        double sumRemainder = sum % 40;
        if(sumRemainder <= 20)
            System.out.println("Total was over the limit");
    }
}
