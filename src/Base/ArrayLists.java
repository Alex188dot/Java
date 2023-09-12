package Base;

import java.util.ArrayList;
import java.util.Collection;

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



    }

}
