package Base;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Exercise: ask the user to insert numbers, return the sum, the average and how many numbers were inserted, press 0 to exit
        /*
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;

        System.out.println("Insert a number to be summed, press 0 to exit: ");
        int num = in.nextInt();
        numbers += 1;

        while(num != 0) {
            sum += num;
            System.out.println("Insert a number to be summed, press 0 to exit: ");
            num = in.nextInt();
            numbers += 1;
        }

        System.out.println("The total sum is: " + sum);
        System.out.println("The average is: " + sum/(numbers - 1));
        System.out.println("The total numbers inserted are: " + (numbers - 1));
        */

        // DO WHILE

        Scanner in = new Scanner(System.in);
        int num;


        int sum2 = 0;
        do {
            System.out.println("Insert a number, or 0 to exit: ");
            num = in.nextInt();
            sum2 += num;
        } while (num != 0);

        System.out.println("Total: " + sum2);


    }
}
