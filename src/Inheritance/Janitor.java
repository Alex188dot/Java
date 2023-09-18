package Inheritance;

public class Janitor extends Person  {
       private String area;

       public Janitor(String name, String lastName, int age, String area) {
           super(name, lastName, age);
           this.area = area;
       }

       public String getArea() {
           return area;
       }

       public void setArea(String area) {
           this.area = area;
       }

       @Override
       public void greet() {
           System.out.println("Hello I'm a janitor and my name is " + getName() + ". I clean the " + this.getArea() + " of the school.");
       }
}
