package Inheritance;

public class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.setName(name);
        this.setLastName(lastName);
        this.setAge(age >= 13 ? age : 13);
    }

    // Methods
    protected void greet() {
        System.out.println("Greetings from " + this.name);
    }


    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + (getName()) + " - Lastname: " + (getLastName()) + " - Age: " + getAge();
    }
}