package Base;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        // ArrayLists only accept reference types. To use them you need to make an import
        // No need to specify the amount of elements
        ArrayList<String> persons = new ArrayList<>();

        persons.add("John");
        persons.add("Jane");
        persons.add("Alex");


        // You can print the ArrayList normally like in JS
        System.out.println(persons);

        // Instead of .length() to print how many elements there are use .size()
        System.out.println(persons.size());

        // Print one element of the array
        System.out.println(persons.get(1));

        System.out.println("----------------------------");

        // For loop
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

        System.out.println("----------------------------");

        for (String el: persons) {
            System.out.println(el);
        }

        System.out.println("----------------------------");

        // ArrayList of numbers
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(3);
        nums.add(2);

        System.out.println(nums);

        System.out.println("----------------------------");

        // Order an array - .sort()
        persons.sort(null);
        System.out.println(persons);

        nums.sort(null);
        System.out.println(nums);

        System.out.println("----------------------------");

        // Change an item of an array - .set()

        persons.set(2, "Harry");
        System.out.println(persons);

        System.out.println("----------------------------");

        // Add an item in a different position than -1

        persons.add(1, "Emily");
        System.out.println(persons);

        System.out.println("----------------------------");

        // Remove an element - .remove()

        persons.remove(1);
        System.out.println(persons);

        System.out.println("----------------------------");

        // Index of an element - .indexOf()

        System.out.println(persons.indexOf("Alex"));

        System.out.println("----------------------------");

        // Check if an element is in the ArrayList - contains()

        System.out.println(persons.contains("Alex"));

        System.out.println("----------------------------");

        // How to copy an ArrayList - .clone()

        ArrayList<String> clonedPersons = (ArrayList<String>)persons.clone();
        System.out.println("Cloned ArrayList: " + clonedPersons);

        System.out.println("----------------------------");


        // Delete all the elements from the ArrayList
        persons.clear();
        System.out.println("Cleared ArrayList: " + persons);

        System.out.println("----------------------------");


        // Exercise: create a To Do list. When you run the application, show all the to do things.
        // If there is nothing to show, print "You have no items in your To Do List".


        Scanner in = new Scanner(System.in);
        ArrayList<String> thingsToDo = new ArrayList<>();
        thingsToDo.add("Study Java");
        thingsToDo.add("Buy groceries");
        thingsToDo.add("Check emails");
        thingsToDo.add("Do laundry");
        System.out.println("These are the things in your To Do List: ");
        int count = 0;
        for (String el: thingsToDo) {
            count++;
            System.out.println(count + ") " + el);
        }
        System.out.println("----------------------------");

        int choice;

        do  {
           System.out.println("Please select one of the options below:\n1) Add a To Do item;\n2) Delete a To Do item;\n3) Exit ");
           choice = in.nextInt();
           String item = in.nextLine();
            if (choice == 1) {
               System.out.println("Please type the item you want to add to your To Do List and then press Enter");
               item = in.nextLine();
               thingsToDo.add(item);
               if (thingsToDo.size() > 0) {
                   System.out.println("These are the things in your To Do List: ");
                   count = 0;
                   for (String el: thingsToDo) {
                       count++;
                       System.out.println(count + ") " + el);
                   }
               } else {
                   System.out.println("You have no items in your To Do List");
               }
                System.out.println("----------------------------");
            } else if (choice == 2) {
            System.out.println("Please type the number of the item you want to remove: ");
            int itemnum = in.nextInt();
            thingsToDo.remove(itemnum - 1);
            if (thingsToDo.size() > 0) {
                System.out.println("These are the things in your To Do List: ");
                count = 0;
                for (String el: thingsToDo) {
                    count++;
                    System.out.println(count + ") " + el);
                }
            } else {
                System.out.println("You have no items in your To Do List");
            }
            }
        } while (choice != 3);






    }

}
