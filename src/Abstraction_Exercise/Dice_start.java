package Abstraction_Exercise;

public class Dice_start {
    public static void main(String[] args) {

        System.out.println("DICE GAME");
        Dice d = new Dice(1,2);
        d.calculate();

        System.out.println("------------------------");

        System.out.println("COIN TOSS GAME");
        CoinToss c = new CoinToss(1,2);
        c.calculate();
    }
}
