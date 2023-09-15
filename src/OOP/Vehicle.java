package OOP;

public class Vehicle {
    public String plate;
    public String model;
    public String owner;
    private final String state;

    /* Exercise: now add a cost property and a method getCost which will print the cost of the car. If the state
    is new add 800€ for fees, if it is used only add 300€

     */

    public int cost;

    Vehicle (String plate, String model, String owner, int cost) {
        this.plate = plate;
        this.model = model;
        this.owner = owner;
        this.state = "Used";
        this.cost = cost;
    }

    // Overload
    Vehicle (String plate, String model, int cost) {
        this.plate = plate;
        this.model = model;
        this.owner = "";
        this.state = "New";
        this.cost = cost;
    }

    // Create a public method to see the state
    public String getState() {
        return state;
    }

    public int getCost() {
        if (this.state.equals("New")) {
            return cost + 800;
        } else {
            return cost +300;
        }
    }



}
