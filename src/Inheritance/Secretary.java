package Inheritance;

public class Secretary extends Person{
    private String room;

    public Secretary(String name, String lastName, int age, String room) {
        super(name, lastName, age);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }


    @Override
    public void greet() {
        System.out.println("Hi I'm a secretary and my name is " + getName() + ". I work in room " + this.getRoom());
    }
}
