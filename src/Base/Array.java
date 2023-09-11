package Base;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // In Java when creating an array you need to specify the type AND the length

        int[] arr = new int[5]; // This creates an array with 5 positions, with index 0-4

        arr[0] = 4; // This will insert 4 in the first position of the array
        arr[1] = 5;
        arr[2] = 8;
        arr[3] = 12;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr);

        String[] arr2 = new String[5];

        arr2[0] = "John";
        arr2[1] = "Mary";

        int[] arr3 = {3, 6, 7, 90, 9};

        System.out.println(arr3[0]);

        // To modify an element of the array

        arr[3] = 15;

        System.out.println("-----------------------------");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


        System.out.println("-----------------------------");

        // Exercise: given ar_num2, return how many are even and odd.

        int[] ar_num2 = {3, 6, 78, 9, 45, 32, 23, 4, 32, 12, 4, 5, 65, 76, 8, 9, 90, 21, 87, 65, 45, 34};

        int evenNum = 0;
        int oddNum = 0;

        for (int i = 0; i < ar_num2.length; i++) {
            if (ar_num2[i] % 2 == 0) {
                evenNum += 1;
            } else {
                oddNum += 1;
            }
        }

        System.out.println("Even numbers are: " + evenNum);
        System.out.println("Odd numbers are: " + oddNum);

        // This one below is the equivalent of ForEach in JS
        for (int el : ar_num2) {
            System.out.println(el);
        }

        // Exercise: ask the user how many students they want to insert and then create an array with the students

        /*

        Scanner in = new Scanner(System.in);
        System.out.println("How many students do you want to insert?");

        int numStudents = in.nextInt();
        String[] arrStud = new String[numStudents];


        for (int i = 0; i < numStudents; i++) {
            System.out.println("Insert " + (i + 1) + "° student: ");
            String Student = in.next();
            arrStud[i] = Student;
        }

        System.out.println("The students inserted are: " );
        for (String el:arrStud) {
            System.out.println(el);
        }
        */

    }

}

