package Methods;

/**
 * Created by braij on 4/4/2017.
 */
public class Methods {

    public static void main(String[] args) {
        displayHighScorePosition("Bobby", calculateHighScorePosition(1500));
        displayHighScorePosition("Ryan", calculateHighScorePosition(900));
        displayHighScorePosition("Johhny", calculateHighScorePosition(400));
        displayHighScorePosition("Jacob", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore > 1000)
            return 1;
        if(playerScore > 500 && playerScore < 1000)
            return 2;
        if(playerScore > 100 && playerScore < 500)
            return 3;
        return 4;
    }

}
