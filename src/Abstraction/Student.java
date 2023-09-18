package Abstraction;

public class Student extends Person {
    private String school_class;
    public Student(String name, String lastName, int age, String school_class) {
        super(name, lastName, age);
        this.school_class = school_class;
    }

    @Override
    public void greet() {
        System.out.println("Hello I'm a student, my name is " + this.getName());
    }
}
