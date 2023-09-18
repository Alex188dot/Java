package Inheritance;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String lastName, int age, String subject) {
        super(name, lastName, age);
        this.subject = subject;
    }

    protected void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    @Override
    public void greet() {
        System.out.println("Hello I'm teacher " + getName() + ". I teach " + this.getSubject());
    }

    @Override
    public String toString() {
        return "Name: " + (getName()) + " - Lastname: " + (getLastName()) + " - Age: " + getAge() + " - Subject: " + getSubject();
    }

}