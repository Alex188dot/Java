package Interfaces;

public class Lion extends Animal implements Predator {
    String mane;

    public Lion(String name, String mane) {
        super(name);
        this.mane = mane;
    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " - Mane: " + this.mane;
    }

    @Override
    public String hunt() {
        return "The hunt starts with a roar!";
    }
}

