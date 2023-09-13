package Base;

public class functionExercises {

    public static void main(String[] args) {

        // Exercise 1: write a function that returns true if a word is a palindrome and false otherwise
        System.out.println(isPalindrome("radar"));

        // Exercise 2: write a function that will return the highest number of 3

        System.out.println(highestNum(30, 10, 15));

    }

    public static boolean isPalindrome(String word) {
        String word2 = "";

        for (int j = word.length() - 1; j >= 0; j--) {
            word2 += word.charAt(j);
        }
        System.out.println("Actual word: " + word);
        System.out.println("Word in reverse: " +word2);

        return word.equals(word2);

    }

    public static int highestNum(int a, int b, int c) {
       return Math.max(Math.max(a, b), Math.max(b, c));
    }
}
