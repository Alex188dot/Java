package Base;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        int n1 = 4, n2 = 5;
        System.out.println(n1 > n2);
        if(n1 < n2) {
            System.out.println("This condition is true!");
        }
        System.out.println("****************************************");

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

        System.out.println("****************************************");
        // IF, ELSE IF, ELSE

        int num1 = 6;

        if (num1 > 10) {
            System.out.println("Number is higher than 10");
        } else if (num1 == 10) {
            System.out.println("Number is equal to 10");
        } else {
            System.out.println("Number is lower than 10");
        }
        System.out.println("****************************************");

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
        System.out.println("****************************************");

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
        /*
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

         */

        System.out.println("****************************************");

        /*
           Exercise: Ask the user an integer number and log if it is odd or even

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert an integer, to check whether the number is even or odd: ");
        int numb = in.nextInt();

        if (numb % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
        */

        System.out.println("****************************************");
        /*
        AND (&&) and OR (||) operators - Also called Literal Operators

        NB the XOR operator - also called exclusive or, represented by the symbol '^',
        only wants one element of two to be true (which means that if both are true, it will return false)

         */
        /*
        // Exercise: Create a software to see if you can ask for the driving license, that is if:
        // the user is 18 years or older and is resident in Italy; (Use .equals() for strings)

        // Declare variables first
        int age;
        String residency;
        Scanner in = new Scanner(System.in);

        System.out.println("How old are you?");
        age = in.nextInt();

        System.out.println("Where do you live?");
        residency = in.next();

        if (age >= 18 && residency.equals("Italy")) {
            System.out.println("Please show me your driving license");
        } else {
            System.out.println("You're good to go!");
        }
        */

        /* Exercise: write a program that will ask how many units have been sold and the total revenue
        for the last quarter. If the agent has sold more than 300 units and the total revenue
        is more than 10000€, they are eligible to receive the bonus.
         */
        /*

        Scanner in = new Scanner(System.in);

        System.out.println("How many units have you sold in the last quarter?");
        int units = in.nextInt();

        System.out.println("What was the € amount of your sales in the last quarter?");
        int sales = in.nextInt();

        if (units >= 300 && sales >= 10000) {
            System.out.println("Well done! You are eligible for the bonus!");
        } else {
            System.out.println("You are not eligible for the bonus.");
        }
         */

    }
}
