package Base;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        int n1 = 4, n2 = 5;
        System.out.println(n1 > n2);
        if(n1 < n2) {
            System.out.println("This condition is true!");
        }

        // IF ELSE
        if (n1 > n2) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        /* Exercise: ask a number to the user, if the number is higher than 10, log "Number is higher than 10", else
        log "Number is lower than 10".
         */
    /*
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert a number: ");
        int num = in.nextInt();

        if (num > 10) {
            System.out.println("Number is higher than 10");
        } else {
            System.out.println("Number is lower than 10");
        }
    */
        // IF, ELSE IF, ELSE

        int num1 = 6;

        if (num1 > 10) {
            System.out.println("Number is higher than 10");
        } else if (num1 == 10) {
            System.out.println("Number is equal to 10");
        } else {
            System.out.println("Number is lower than 10");
        }

    }
}
