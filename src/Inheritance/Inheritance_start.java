package Inheritance;

import java.util.ArrayList;

public class Inheritance_start {
    public static void main(String[] args) {
        Person p1 = new Person("Harry", "Brown", 35);
        Student s1 = new Student("John", "Doe", 18, "5A");
        Student s2 = new Student("Mary", "Brown", 18, "5B");
        Student s3 = new Student("Jane", "Doe", 18, "5C");
        Student s4 = new Student("John", "Doe", 18, "5D");
        Teacher t1 = new Teacher("Derek", "Tent", 38, "Philosphy");
        Teacher t2 = new Teacher("Joshua", "White", 32, "Math");
        Janitor j1 = new Janitor("Jake", "Brown", 18, "west wing");
        Secretary ss1 = new Secretary("Jane", "Doe", 42, "1H");

        p1.greet();
        s1.greet();
        t1.greet();
        j1.greet();
        ss1.greet();


        // To create an array of students:

        Student [] classA = new Student[10];
        classA[0] = s1;
        classA[1] = s2;
        System.out.println(classA.length); // Note that here it will still say 10 even if there are only 2 students

        // Or to create an Array List of students:

        ArrayList<Student> classB = new ArrayList<>();
        classB.add(s3);
        classB.add(s4);
        System.out.println(classB.size()); // Here it will be the correct size

        System.out.println(p1);
        System.out.println(s1);

        Teacher [] teachersA = new Teacher[2];
        teachersA[0] = t1;
        teachersA[1] = t2;

        System.out.println("------------------------------------");
        System.out.println("The teachers for class 5A are: ");

        for (Teacher el_t: teachersA) {
            System.out.println(el_t);
        }






    }
}
