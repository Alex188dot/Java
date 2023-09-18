package Inheritance;

public class Student extends Person {

    private String school_class;
    public Student(String name, String lastName, int age, String s) {
        super(name, lastName, age);
        this.school_class = school_class;
    }

    // To overwrite a parent method I need to use the @Override decorator
    @Override
    public void greet() {
        System.out.println("Hello I'm student " + this.getName());
    }

}
