package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Composition {

    public static void main(String[] args) {
        Bed bed = new Bed("King", new Dimensions("Bed", 76d, 80d, 38d),10, true, true);
        Desk desk = new Desk("Glass", "Black", 8, new Lamp(), new Dimensions("Desk", 60d, 29.5, 30d));
        Dresser dresser = new Dresser("Wood", 250, new Dimensions("Dresser", 30d, 100d, 20d));
        Closet closet = new Closet("Large", 500, new Dimensions("Closet", 152d, 120d, 100d), true);
        Lightswitch lightswitch = new Lightswitch();
        Curtain curtain = new Curtain("Shade", "Red", new Dimensions("Curtain", 76d, 52d, 2d));
        Window window = new Window(new Dimensions("Window", 76d, 52d, 4d));

        Bedroom bedroom = new Bedroom(bed, desk, dresser, closet, lightswitch, curtain, window, new Dimensions("Bedroom", 150d, 150d, 150d));
        System.out.println(bedroom.getDimensions());
        bedroom.goIn();
        bedroom.getDesk().work();
        bedroom.getDresser().changeClothes();
        bedroom.getBed().sleep();
        bedroom.getCloset();
        bedroom.getCloset().changeClothes();
        bedroom.goOut();
    }

}
