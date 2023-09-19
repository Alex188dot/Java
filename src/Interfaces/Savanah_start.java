package Interfaces;

public class Savanah_start {
    public static void main(String[] args) {
        Lion l1 = new Lion("Lion1", "Yes");
        System.out.println(l1.hunt());
        Gazelle g1 = new Gazelle("Gazelle1", "Yes");
        System.out.println(g1.run());
        Fish f1 = new Fish("Fish1", "Yes");
        System.out.println(f1.swim());

    }

}
