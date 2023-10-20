package Game_CardGame;

public class Werewolf extends Character implements Monster, Human {
    int Health;
    boolean isFullMoon = false;
    public Werewolf(String name, int Health, boolean isFullMoon) {
        super(name);
        this.Health = Health;
        this.isFullMoon = isFullMoon;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int Health) {
        this.Health = Health;
    }

    public boolean getIsFullMoon() {
        return isFullMoon;
    }

    public void setFullMoon(boolean isFullMoon) {
        this.isFullMoon = isFullMoon;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " - Initial Health: " + Health;
    }

    @Override
    public int bite() {
        return 4;
    }

    @Override
    public int fight() {
        return 3;
    }

}
