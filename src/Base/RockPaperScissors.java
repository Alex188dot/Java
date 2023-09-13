package Base;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type your choice! Rock 🪨, paper 📄 or scissors ✂️");
        String playerOne = in.nextLine();

        int res1 = 0;
        int res2 = result();
        System.out.println("Your choice: " + cleanString(playerOne));
        String resultString = "";
        if (res2 == 1) {
            resultString = "rock";
        } else if (res2 == 2) {
            resultString = "paper";
        } else if (res2 == 3) {
            resultString = "scissors";
        }
        System.out.println("Player 2's choice: " + resultString);


        if (Objects.equals(playerOne, "rock")) {
            res1 = 1;
        } else if (Objects.equals(playerOne, "paper")) {
            res1 = 2;
        } else if (Objects.equals(playerOne, "scissors")) {
            res1 = 3;
        }

        if (res1 == 1 && res2 == 1 || res1 == 2 && res2 == 2 || res1 == 3 && res2 == 3) {
        System.out.println("That's a draw! 🟨");
        } else if (res1 == 1 && res2 == 2 || res1 == 2 && res2 == 3 || res1 == 3 && res2 == 1) {
            System.out.println("Sorry you lost! 🟥 Player 2 won!");
        } else if (res1 == 1 && res2 == 3 || res1 == 2 && res2 == 1 || res1 == 3 && res2 == 2) {
            System.out.println("You won! 🟩 Player 1 won!");
        }


    }


    public static String cleanString(String str) {
     str = str.trim();
     str = str.toLowerCase();
     str = str.replace(",", "");
     str = str.replace(".", "");
     str = str.replace("  ", " ");
     return str;
    }


    public static int result() {
        // 1 win, 2 lose, 3 even
        Random rm = new Random();
        String playerTwo;
        String [] symbols = {"rock", "paper", "scissors"};
        playerTwo = symbols[rm.nextInt(3)];
        System.out.println(playerTwo);
        int res = 0;
        if (playerTwo == "rock") {
            res = 1;
        } else if (playerTwo == "paper") {
            res = 2;
        } else if (playerTwo == "scissors") {
            res = 3;
        }
        return res;
    }
}