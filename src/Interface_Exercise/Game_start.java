package Interface_Exercise;
import java.util.Scanner;
import java.util.Random;

public class Game_start {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero", 15);
        System.out.println(hero);
        Vampire vampire = new Vampire("Vampire", 15);
        System.out.println(vampire);
        Werewolf werewolf = new Werewolf("Werewolf", 15, true);
        System.out.println(werewolf);


        System.out.println("Welcome to the game");
        int choice = 0;
        do {
            System.out.println("Choose your character: \n1 = Hero, \n2 = Vampire, \n3 = Werewolf\n0 = Exit");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            in.nextLine();
            if (choice == 1) {
                System.out.println("You chose Hero! 🧙");
                String p2 = P2.choose(new String[]{"Hero", "Vampire", "Werewolf"});
                System.out.println("Your opponent chose: " + p2);
                if (p2 == "Hero") {
                    System.out.println("It's a tie! 🟨");
                } else if (p2 == "Vampire") {
                    hero.setHealth(hero.getHealth() - vampire.bite());
                    vampire.setHealth(vampire.getHealth() - hero.fight());
                    vampire.setHealth(vampire.getHealth() - hero.fight());
                    vampire.setHealth(vampire.getHealth() - hero.fight());
                    System.out.println("Your health is: " + hero.getHealth());
                    System.out.println("Your opponent's health is: " + vampire.getHealth());
                    System.out.println("You win! 🟩");
                    hero.setHealth(15);
                    vampire.setHealth(15);
                } else if (p2 == "Werewolf") {
                    if (werewolf.getIsFullMoon() == true) {
                        System.out.println("Full Moon is on! 🌕");
                        hero.setHealth(hero.getHealth() - werewolf.bite());
                        hero.setHealth(hero.getHealth() - werewolf.bite());
                        hero.setHealth(hero.getHealth() - werewolf.bite());
                        werewolf.setHealth(werewolf.getHealth() - hero.fight());
                        werewolf.setHealth(werewolf.getHealth() - hero.fight());
                        System.out.println("Your health is: " + hero.getHealth());
                        System.out.println("Your opponent's health is: " + werewolf.getHealth());
                        System.out.println("You lose! 🟥");
                        werewolf.setFullMoon(false);
                        System.out.println("It is not full moon anymore 🌗, the werewolf is a human now..!");
                        hero.setHealth(15);
                        werewolf.setHealth(15);
                    } else if (werewolf.getIsFullMoon() == false) {
                        System.out.println("It is not full moon..!");
                        hero.setHealth(hero.getHealth() - werewolf.fight());
                        hero.setHealth(hero.getHealth() - werewolf.fight());
                        werewolf.setHealth(werewolf.getHealth() - hero.fight());
                        werewolf.setHealth(werewolf.getHealth() - hero.fight());
                        werewolf.setHealth(werewolf.getHealth() - hero.fight());
                        System.out.println("Your health is: " + hero.getHealth());
                        System.out.println("Your opponent's health is: " + werewolf.getHealth());
                        System.out.println("You win! 🟩");
                        System.out.println("The Full moon is on! 🐺");
                        hero.setHealth(15);
                        werewolf.setHealth(15);
                    }
                }
                System.out.println("----------------------------");
            } else if (choice == 2) {

            } else if (choice == 3) {

            }
        } while (choice != 0);

    }


}
