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

        /* Exercise: given the time, return if it is morning, afternoon, evening or night.

        From 6am to 12pm is morning
        From 12pm to 4pm is afternoon
        From 4pm to 10pm is evening
        From 10pm to 6am is night

        */

        int time = 20;

        if (time >= 22) {
            System.out.println("Night");
        } else if(time >= 16) {
            System.out.println("Evening");
        } else if(time >= 12) {
            System.out.println("Afternoon");
        } else {
            System.out.println("Morning");
        }

        // Exercise: Ask the user to insert an exercise for the division. If the second number is equal to 0
        // log: Invalid division. Otherwise, show the result. The numbers should be double type.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the dividend: ");

        double dividend = in.nextDouble();

        System.out.println("Please insert the divisor: ");
        double divisor = in.nextDouble();

        if (divisor == 0.0) {
            System.out.println("Invalid division");
        } else {
            double result = dividend/divisor;
            System.out.println("Here is the result of the division: " + result);
        }
        */
        // Exercise: Ask the user what operation they want to do and after that asked two numbers and then show the result

        Scanner in = new Scanner(System.in);
        System.out.println("Please select an operation: \n1) Sum;\n2) Subtraction;\n3) Multiplication;\n4) Division");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.println("Insert the first number: ");
            double firstSum = in.nextDouble();

            System.out.println("Insert the second number: ");
            double secondSum = in.nextDouble();

            double resultSum = firstSum+secondSum;
            System.out.println("Here is the result of the Sum: " + resultSum);
        } else if (choice == 2) {
            System.out.println("Insert the first number: ");
            double firstSub = in.nextDouble();

            System.out.println("Insert the second number: ");
            double secondSub = in.nextDouble();

            double resultSub = firstSub-secondSub;
            System.out.println("Here is the result of the Subtraction: " + resultSub);
        } else if (choice == 3) {
            System.out.println("Insert the first number: ");
            double firstMul = in.nextDouble();

            System.out.println("Insert the second number: ");
            double secondMul = in.nextDouble();

            double resultMul = firstMul*secondMul;
            System.out.println("Here is the result of the Multiplication: " + resultMul);
        } else if (choice == 4) {
            System.out.println("Please insert the dividend: ");
            double dividend = in.nextDouble();

            System.out.println("Please insert the divisor: ");
            double divisor = in.nextDouble();

            if (divisor == 0.0) {
                System.out.println("Invalid division");
            } else {
                double result = dividend/divisor;
                System.out.println("Here is the result of the division: " + result);
            }
        } else {
            System.out.println("Please select one of the available operations. from 1 to 4");
        }

        // Alternatively - shorter code

        System.out.println("Insert the first number: ");
        double first = in.nextDouble();

        System.out.println("Insert the second number: ");
        double second = in.nextDouble();

        System.out.println("Please select an operation: \n1) Sum;\n2) Subtraction;\n3) Multiplication;\n4) Division");
        int choice_1 = in.nextInt();

        if (choice_1 == 1) {
            double result = first+second;
            System.out.println("The result of the sum is: " + result);
        } else if (choice_1 == 2) {
            double result = first-second;
            System.out.println("The result of the subtraction is: " + result);
        } else if (choice_1 == 3) {
            double result = first*second;
            System.out.println("The result of the multiplication is: " + result);
        } else if (choice_1 == 4) {
            if (second == 0) {
                System.out.println("Invalid division");
            } else {
                double result = first/second;
                System.out.println("The result of the subtraction is: " + result);
            }
        } else {
            System.out.println("Invalid choice!");
        }


    }
}
