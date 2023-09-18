package Inheritance_Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {

        ArrayList<Product> grocery_list = new ArrayList<>();

        int choice = 0;
        Scanner in = new Scanner(System.in);
        boolean fidelityCard = false;
        System.out.println("Welcome to the Java Supermarket");
        System.out.println("Are you a fidelity card holder? (Y/N)");
        if (in.nextLine().equals("Y")) {
            fidelityCard = true;
        }
        do {
        System.out.println("What would you like to do?\n1. Add a food item\n2. Add a non-food item\n3. Remove an item\n4. Print the list\n5. Exit");
        choice = in.nextInt();
        in.nextLine();
        if (choice < 1 || choice > 5) {
            System.out.println("Please enter a valid choice");
        } else if (choice == 1) {
            System.out.println("Please enter the bardcode of the item you want to add to your grocery list: ");
            String barcode = in.nextLine();
            System.out.println("Please enter the description of the item you want to add to your grocery list: ");
            String description = in.nextLine();
            System.out.println("Please enter the price of the item you want to add to your grocery list: ");
            int price = in.nextInt();
            in.nextLine();
            System.out.println("Please enter the expiration date of the item you want to add to your grocery list with the format dd/mm/yyyy: ");
            String expirationDate = in.nextLine();
            grocery_list.add(new FoodProduct(barcode, description, price, expirationDate));
            System.out.println("Item successfully added!");
        } else if (choice == 2) {
            System.out.println("Please enter the bardcode of the item you want to add to your grocery list: ");
            String barcode = in.nextLine();
            System.out.println("Please enter the description of the item you want to add to your grocery list: ");
            String description = in.nextLine();
            System.out.println("Please enter the price of the item you want to add to your grocery list: ");
            int price = in.nextInt();
            System.out.println("Please enter the material of the item you want to add to your grocery list: ");
            String material = in.nextLine();
            grocery_list.add(new Non_FoodProduct(barcode, description, price, material));
            System.out.println("Item successfully added!");
        } else if (choice == 3) {
            System.out.println("Please enter the number of the item you want to remove: ");
            int count = 0;
            for (Product el: grocery_list) {
                count++;
                System.out.println(count + ") " + el);
            }
            int itemnum = in.nextInt();
            grocery_list.remove(itemnum - 1);
            System.out.println("Item successfully removed!");
        } else if (choice == 4) {
            int count = 0;
            for (Product el: grocery_list) {
                count++;
                System.out.println(count + ") " + el);
            }
        } else if (choice == 5) {
            if (grocery_list.isEmpty()) {
                System.out.println("Your grocery list is empty, come back soon!");
            } else {
                if (fidelityCard) {
                    double total = 0;
                    System.out.println("Your grocery list is: ");
                    for (Product el: grocery_list) {
                        el.applyDiscount();
                        total += el.getPrice();
                        System.out.println(el);
                    }
                    System.out.println("And your total is: " + total + "€");
                }
                System.out.println("Goodbye!");
            }
        }
        } while (choice != 5);
    }

}
