package Base;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Write some text and it will be returned 'cleaned'");
        String phrase = in.nextLine();

        System.out.println("Cleaned text: " + cleanString(phrase));

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
        String computerGame;
        String [] symbols = {"rock", "paper", "scissors"};
        computerGame = symbols[rm.nextInt(3)];
        System.out.println(computerGame);
        return 0;
    }
}