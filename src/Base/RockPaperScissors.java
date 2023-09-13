package Base;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        int gamesWon = 0;
        int gamesLost = 0;
        int gamesdrawn = 0;

        Scanner in = new Scanner(System.in);
        String playerOne = "";
        while (!Objects.equals(playerOne, "exit")) {
            System.out.println("Type your choice! Rock 🪨, paper 📄 or scissors ✂️ - exit to leave the game");
            playerOne = in.nextLine();

            int res1 = 0;
            int res2 = playerTwo();
            System.out.println("Your choice: " + cleanString(playerOne));
            if (!Objects.equals(cleanString(playerOne), "rock") || !Objects.equals(cleanString(playerOne), "paper") || !Objects.equals(cleanString(playerOne), "scissors") || !Objects.equals(cleanString(playerOne), "exit")) {
              System.out.println("---------------Please insert a valid command!-------------");
            };
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

            if (res1 == res2) {
                System.out.println("That's a draw! 🟨");
                gamesdrawn++;
            } else if (res1 == 1 && res2 == 2 || res1 == 2 && res2 == 3 || res1 == 3 && res2 == 1) {
                System.out.println("Sorry you lost! 🟥 Player 2 won!");
                gamesLost++;
            } else if (res1 == 1 && res2 == 3 || res1 == 2 && res2 == 1 || res1 == 3 && res2 == 2) {
                System.out.println("You won! 🟩 Player 1 won!");
                gamesWon++;
            }
            System.out.println("-------------------------");


        }
            System.out.println("------------GAME OVER-------------");
            System.out.println("Your Stats 📊:");
            System.out.println("Total games: " + (gamesWon + gamesLost + gamesdrawn));
            System.out.println("Total games won: " + gamesWon + " 😃");
            System.out.println("Total games lost: " + gamesLost + " 🙁");
            System.out.println("Total games drawn: " + gamesdrawn + " 😐");




    }


    public static String cleanString(String str) {
     str = str.trim();
     str = str.toLowerCase();
     str = str.replace(",", "");
     str = str.replace(".", "");
     str = str.replace("  ", " ");
     return str;
    }


    public static int playerTwo() {
        // 1 win, 2 lose, 3 even
        Random rm = new Random();
        String result;
        String [] symbols = {"rock", "paper", "scissors"};
        result = symbols[rm.nextInt(3)];
        System.out.println(result);
        int res = 0;
        if (result.equals("rock")) {
            res = 1;
        } else if (result.equals("paper")) {
            res = 2;
        } else if (result.equals("scissors")) {
            res = 3;
        }
        return res;
    }
}