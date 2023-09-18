package Abstraction_Exercise;
import java.util.Random;

public class Dice extends Result {

    public Dice(int player1, int player2) {
        super(player1, player2);
    }

    @Override
    public void calculate() {
        Random rand = new Random();
        int result1 = rand.nextInt(6) + 1;
        int result2 = rand.nextInt(6) + 1;
        System.out.println("Your result is: " + result1);
        System.out.println("Player 2's result is: " + result2);

        if (result1 > result2) {
            System.out.println("Player 1 wins!");
        } else if (result1 < result2) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Draw!");
        }
    }
}
