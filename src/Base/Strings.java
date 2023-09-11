package Base;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String name = "Alex";

        // NB a string is an array of characters

        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println("Last letter of Alex is: " + name.charAt(name.length() - 1));
        System.out.println("--------------------");

        // Exercise: Given a string "hello world", return how many vowels there are


        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int wordVowels = 0;
        int wordVowels2 = 0;

        // Method 1
        String word = "hello world";
        for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    wordVowels++;
                };
        }
        System.out.println("Vowels in the word: " + wordVowels);

        System.out.println("--------------------");

        // Method 2
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    wordVowels2++;
                }
            };
        }
        System.out.println("Vowels in the word: " + wordVowels2);

        System.out.println("--------------------");

        // Exercise: get a string and return it the other way around
        // After that check if it is a palindrome

        String test;
        test = "A";
        test += "B";
        test += " Ciao";

        String word2 = "radar";
        String word3 = "";



        System.out.println("Word in Reverse: ");
        for (int j = word2.length() - 1; j >= 0; j--) {
            System.out.println(word2.charAt(j));
        }

        System.out.println("--------------------");

        for (int j = word2.length() - 1; j >= 0; j--) {
            word3 += word2.charAt(j);
        }

        System.out.println(word3);

        if (word2.equals(word3)) {
            System.out.println("It's a palindrome!");
        }



    }
}
