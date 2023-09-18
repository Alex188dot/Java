package Abstraction;

public abstract class Person {
    private String name;
    private String lastName;
    private int age;

    /* Abstract classes can have abstract methods. Abstract classes can't be used to create objects but can only be inherited.
    A class which extends this class must define the methods otherwise it will become an abstract class too

     */

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract void greet(); // This is an abstract method. Whoever extends this class must define it

}
