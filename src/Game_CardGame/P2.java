package Game_CardGame;
import java.util.Random;
public class P2 {
    public static String choose(String[] options) {
        Random random = new Random();
        int length = options.length;
        int index = random.nextInt(length);
        return options[index];
    }

    public static void main(String[] args) {
        String[] options = {"hero", "vampire", "werewolf"};
        System.out.println("The chosen option is " + choose(options));
    }
}
