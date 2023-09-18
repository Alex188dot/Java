package Inheritance;

public class repeatingStudent extends Student{
    private String repeatingYears;
    public repeatingStudent(String name, String lastName, int age, String school_class, String repeatingYears) {
        super(name, lastName, age, school_class);
        this.repeatingYears = repeatingYears;
    }

    public String getRepeatingYears() {
        return repeatingYears;
    }

    public void setRepeatingYears(String repeatingYears) {
        this.repeatingYears = repeatingYears;
    }

    @Override
    public String toString() {
        return "Name: " + (getName()) + " - Lastname: " + (getLastName()) + " - Age: " + getAge() + " - Class: " + getSchool_class() + " - Repeating Years: " + getRepeatingYears();
    }
}
