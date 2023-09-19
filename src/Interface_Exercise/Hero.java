package Interface_Exercise;

public class Hero extends Character implements Human{
    int Health;
    public Hero(String name, int Health) {
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
    public int fight() {
        return 3;
    }
}
