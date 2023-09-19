package Interfaces;

public class Fish extends Animal implements Predator, Prey {
    String fin;
    public Fish(String name, String fin) {
        super(name);
        this.fin = fin;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " - Fin: " + this.fin;
    }

    @Override
    public String hunt() {
        return null;
    }

    @Override
    public String run() {
        return null;
    }

    public String swim(){
        return "The fish swims!";
    }

}
