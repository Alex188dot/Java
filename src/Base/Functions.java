package Base;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        greet();
        greetName("John");
        sum(3, 4);


        calcPrice(9.99, 20);

        /*
        int choice;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Press 1 to calculate the discounted price or 0 to exit: ");
            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Please insert a price");
                double pr = in.nextDouble();
                System.out.println("Please insert the discount: ");
                int disc = in.nextInt();
                calcPrice(pr, disc);
            }
        } while (choice != 0);
        */

        int choice;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Please insert your choice: \n1) for sum;\n2) for subtraction\n3) for multiplication\n4) for division\n5) to exit");
            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Please insert your first number");
                int firstNum = in.nextInt();
                System.out.println("Please insert your second number");
                int secondNum = in.nextInt();
                sum(firstNum, secondNum);
            } else if (choice == 2) {
                System.out.println("Please insert your first number");
                int firstNum = in.nextInt();
                System.out.println("Please insert your second number");
                int secondNum = in.nextInt();
                subtraction(firstNum, secondNum);
            } else if (choice == 3) {
                System.out.println("Please insert your first number");
                int firstNum = in.nextInt();
                System.out.println("Please insert your second number");
                int secondNum = in.nextInt();
                multiplication(firstNum, secondNum);
            } else if (choice == 4) {
                System.out.println("Please insert your first number");
                int firstNum = in.nextInt();
                System.out.println("Please insert your second number");
                int secondNum = in.nextInt();
                if (secondNum != 0) {
                    division(firstNum, secondNum);
                } else {
                    System.out.println("Impossible to divide a number by 0");
                }
            }
        } while (choice != 5);







    }


    /* Functions are to be defined outside the main scope
        Rules:
        1) Visibility of the function;
        2) static (optional), if it needs to be called within the same class
        3) type of return, if no returns are expected add void
        4) name of the function
        5) parameters (optional)
     */

    public static void greet() {
        System.out.println("Hello world!");
    }

    public static void greetName(String name) {
        System.out.println("Hello " + name);
    }



    /* Exercise: create a function that will print a discounted price,
    given the price as an argument. The price is of type double and percentage is of type int
    */

    public static void calcPrice(double price, int discount) {
        if (discount >= 0 && discount <= 100) {
            double discountedPrice = price * (100 - discount)/ 100;
            System.out.println("The discounted price is: " + discountedPrice + "€");
        } else {
            System.out.println("The discount is out of range! Please try again");
        }

    }

    public static void sum(int a, int b) {
        System.out.println("Sum: " + a + b);
    }

    public static void subtraction(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public static void multiplication(int a, int b) {
        System.out.println("Subtraction: " + (a * b));
    }

    public static void division(int a, int b) {
        System.out.println("Subtraction: " + (a / b));
    }




}
