package Abstraction_Exercise;

import java.util.Random;
import java.util.Scanner;

public class CoinToss extends Result {
    public CoinToss(int player1, int player2) {
        super(player1, player2);


    }
    @Override
    public void calculate() {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert a number:\n 1 = Heads\n 2 = Tails");
        int choice = in.nextInt();
        in.nextLine();
        if (choice == 1) {
            System.out.println("You chose Heads");
        } else {
            System.out.println("You chose Tails");
        }
        int result1 = rand.nextInt(2) + 1;
        if (choice == result1) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }

}
