package Interfaces;

public class Gazelle extends Animal implements Prey {
    String horn;
    public Gazelle(String name, String horn) {
        super(name);
        this.horn = horn;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " - Horn: " + this.horn;
    }

    @Override
    public String run() {
        return "The gazelle runs!!";
    }


}
