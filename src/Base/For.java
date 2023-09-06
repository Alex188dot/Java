package Base;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

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
    }
}