package Interface_Exercise;
import java.util.Random;
public class P2 {
    public static String choose(String[] options) {
        // Create a random number generator
        Random random = new Random();

        // Get the length of the array
        int length = options.length;

        // Generate a random index between 0 and length - 1
        int index = random.nextInt(length);

        // Return the element at the random index
        return options[index];
    }

    // A main method that tests the function
    public static void main(String[] args) {
        // Create an array of strings with the options
        String[] options = {"hero", "vampire", "werewolf"};

        // Call the function and print the result
        System.out.println("The chosen option is " + choose(options));
    }
}
