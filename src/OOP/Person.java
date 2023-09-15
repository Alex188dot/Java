package OOP;

public class Person {

    /*

    Every class has some properties (variables)
    All properties need to define the visibility. If you do not do that they will be public by default
    There are 3 types of visibility:
    1) public, both the same class and other classes will be able to see these properties;
    2) protected, the properties are visible from the class itself and its children classes (sub-classes);
    3) private, the properties are visible only from within the class itself.

    NB If you don't create a constructor, Java will assign a default one to your class, which
    will assign a standard value to the properties.

     */

    public String name;
    public String lastname;
    public String taxID;
    public int age;


    Person(String name, String lastname, String taxID, int age) {
        // If the properties have the same name (ex. name above and name here),
        // I can refer to the class properties with this.name
        this.name = name; // This is to assign the parameter you receive as class property
        this.lastname = lastname;
        this.taxID = taxID;
        this.age = age;

    }


    public void greet() {
        System.out.println("Hello from " + this.name);
    }
}
