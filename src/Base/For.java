package Base;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        /*
        // SWITCH CASE - Not really used anymore but good to know when dealing with old code bases

        Scanner in = new Scanner(System.in);
        System.out.println("Please select an operation: \n1) Sum;\n2) Subtraction;\n3) Multiplication;\n4) Division");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose Sum");
                // Your code here
                break;
            case 2:
                System.out.println("You chose Subtraction");
                // Your code here
                break;
            case 3:
                System.out.println("You chose Multiplication");
                // Your code here
                break;
            case 4:
                System.out.println("You chose Division");
                // Your code here
                break;
            default:
                System.out.println("Invalid choice");
        }



        // FOR LOOP - (initial index; exit condition; increment)

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

         */

        /*
         Exercise: Ask the user which multiplication table they want to see.
         Optional: Ask when they want to start and when they want to finish.
         Then, print the multiplication table.
         Example:
         start = 1
         end = 10
         2 X 1 = 2
         2 X 2 = 4
         ...
         */

        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the number for which you want to see the multiplication table of: ");
        int num = in.nextInt();

        System.out.println("Please insert where you would like to start: ");
        int start = in.nextInt();

        System.out.println("Please insert where you would like to finish: ");
        int finish = in.nextInt();

        if (start <= finish) {
            for (int i = start; i <= finish; i++) {
                System.out.println(num + " X " + i + " = " + (num * i));
                }
        } else {
          System.out.println("Please insert a finish number, higher than the start number");
        }
         */


        // Exercise: Ask the user 5 numbers and then show the sum
        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Insert 5 numbers and I will return the sum at the end");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Insert a number: ");
            int number =  in.nextInt();
            sum += number;
        }

        System.out.println("The sum is: " + sum);

        System.out.println("****************************************");

        // Exercise: Ask 10 numbers, how many numbers are even, how many numbers are odd,
        // sum of even numbers, sum of odd numbers, total sum

        System.out.println("Insert 10 numbers and I will return:\nHow many numbers are even,\nHow many numbers are odd,\nSum of the even numbers, \nSum of odd numbers,\nTotal sum");
        int odd = 0;
        int even = 0;
        int oddSum = 0;
        int evenSum =0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insert a number: ");
            int number =  in.nextInt();
            if (number % 2 == 0) {
                even += 1;
                evenSum += number;
            } else {
                odd += 1;
                oddSum += number;
            }
        }
        System.out.println("There are: " + even + " even numbers");
        System.out.println("There are: " + odd + " odd numbers");
        System.out.println("The total sum of even numbers is: " + evenSum);
        System.out.println("The total sum of odd numbers is: " + oddSum);
        System.out.println("The total sum of all numbers is: " + (evenSum+oddSum));
    }


*/
    }}