package Inheritance;

public class Inheritance_start {
    public static void main(String[] args) {
        Person p1 = new Person("Harry", "Brown", 35);
        Student s1 = new Student("John", "Doe", 18, "5A");
        Teacher t1 = new Teacher("Derek", "Tent", 38, "Philosphy");
        Janitor j1 = new Janitor("Jake", "Brown", 18, "west wing");
        Secretary ss1 = new Secretary("Jane", "Doe", 42, "1H");

        p1.greet();
        s1.greet();
        t1.greet();
        j1.greet();
        ss1.greet();


    }
}
