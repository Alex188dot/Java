package Base;


import java.util.Arrays;
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
                }
        }
        System.out.println("Vowels in the word: " + wordVowels);

        System.out.println("--------------------");

        // Method 2
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    wordVowels2++;
                }
            }
        }
        System.out.println("Vowels in the word: " + wordVowels2);

        System.out.println("--------------------");

        // Exercise: get a string and return it the other way around
        // After that check if it is a palindrome


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

        System.out.println("--------------------");

        // STRING METHODS

        Scanner in = new Scanner(System.in);
        String str = "test string";

        // .char.at() - Use the index in the parentheses
        System.out.println(str.charAt(0));

        // .length() - Tells us the number of characters in a string, including spaces
        System.out.println(str.length());

        // .trim() - This removes whitespaces from left and right of a string
        String str1 = "   test one  ";
        System.out.println(str1.trim());

        // .equals() - Checks whether two strings are the same (case sensitive)
        String str2 = "John";
        String str3 = "john";

        System.out.println(str2.equals(str3));

        // .toLowerCase() and .toUpperCase() - transform everything to lower or upper case

        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        // .equalsIgnoreCase() - This is case insensitive but remember to use .trim() as well

        String str4 = "Mary";
        String str5 = "mary";

        System.out.println(str4.equalsIgnoreCase(str5));

        System.out.println("--------------------");

        // Exercise: given the string "      Ciao Mondo    " return the characters of the string without whitespaces (including in between the two words)

        String str_es1 = "      Ciao Mondo    ";
        System.out.println(str_es1.trim().length() -1);

        // .replaceFirst(), .replace(), .replaceAll() - NB only .replace() modifies the string

        String str6 = "Java course for Java students";

        System.out.println(str6.replaceFirst("Java", "PHP"));

        System.out.println(str6.replaceAll("Java", "PHP"));

        System.out.println(str6);

        str6.replace("Java", "PHP");
        // to be used with return to actually work, otherwise IntelliJ will ignore it

        // .substring() - Needs the index where to start from

        String str7 = "Welcome to the Java Developer course!";
        System.out.println(str7.substring(10));

        // You can also include where to finish (last character not included)

        System.out.println(str7.substring(0, 19));

        // .indexOf() - Returns the position of the first found occurrence of specified characters in a string

        System.out.println(str7.indexOf("Java"));

        // Transform a string into an array

        String names = "John Jane Alex";
        String [] namesArr = names.split(" ");
        System.out.println(Arrays.toString(namesArr));

        // When dealing with numbers, you need to cast them

        String numbers = "1,2,5,7,90,32";
        String [] numsArr = numbers.split(",");
        System.out.println(Arrays.toString(numsArr));

        int sum = 0;

        for (String strA : numsArr) {
                int num = Integer.parseInt(strA);
                sum += num;
        }

        System.out.println("The sum is: " + sum);

        System.out.println("--------------------");


        // Exercise: Ask the user to insert a few numbers divided by a comma, return the sum and the average

        Scanner inp = new Scanner(System.in);
        System.out.println("Please insert as many numbers as you want divided, by a space. I will return the sum and the average: ");

        String nums = inp.nextLine();
        String [] numsArr2 = nums.trim().split(" ");
        System.out.println(Arrays.toString(numsArr2));

        int sum1 = 0;
        int count = 0;

        for (String strB : numsArr2) {
            int num = Integer.parseInt(strB);
            sum1 += num;
            count += 1;
        }


        System.out.println("The total sum of the numbers inserted is: " + sum1);
        System.out.println("The average is: " + sum1/count);










    }
}
