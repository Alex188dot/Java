package OOP;

public class Vehicle_start {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("EG6678", "E5", "John", 40000);
        Vehicle v2 = new Vehicle("WR7765", "RAV4", "Mary", 29000);
        Vehicle v3 = new Vehicle("HU87996", "500", 25000);

        // If I want to print the state of the vehicle which is private I need a method

        System.out.println(v2.getState());

        System.out.println(v1.getCost());
        System.out.println(v3.getCost());
    }
}
