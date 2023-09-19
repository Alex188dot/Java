package Interface_Exercise;

public class Vampire extends Character implements Monster {
    int Health;
    public Vampire(String name, int Health) {
        super(name);
        this.Health = Health;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int Health) {
        this.Health = Health;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " - Initial Health: " + Health;
    }

    @Override
    public int bite() {
        return  2;
    }
}
