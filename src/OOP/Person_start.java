package OOP;

public class Person_start {
    public static void main(String[] args) {

        /* In order to use the Person class to define a new user I need to declare a Person object.
        It becomes an Instance of the Person Class, or in other words an Object of the Person Class.
         */

        Person u1 = new Person("John", "Doe", "JD001", 25); // This is a new Object of the Person Class
        Person u2 = new Person("Harry", "Brown", "HB002", 28);

        /*
        u1.name = "John";
        u1.lastname = "Doe";
        u1.taxID = "JD001";
        u1.age = 25;
         */

        System.out.println(u1.name);
        System.out.println(u2.lastname);

        u1.greet();
        u2.greet();
    }


}
