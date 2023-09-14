package Base;

import java.util.Scanner;
import java.util.InputMismatchException;

public class try_catch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Insert a number: ");
            int n1 = in.nextInt();

            System.out.println("Insert the second number: ");
            int n2 = in.nextInt();

            System.out.println("Result: " + n1/n2);
        } catch (InputMismatchException e) { // This will catch specific mismatch errors
            System.out.println("You can insert only numbers!");
        }
        catch (Exception e) { // This will catch generic errors
            System.out.println("Error of type: " + e);
            System.out.println("Please try again and insert a valid number");
        } finally {
            System.out.println("Closing the program...");
            in.close();
        }





    }
}
