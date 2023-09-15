package OOP;

public class Student_start {
    public static void main(String[] args) {

        Student s1 = new Student("John", "Doe", "JJ001");

        System.out.println(s1);
        s1.setName("Mary");
        s1.setLastname("Brown");
        s1.setIDNum("HH002");
        System.out.println(s1.getName());
        System.out.println(s1.getLastname());
        System.out.println(s1.getIDNum());

    }


}
