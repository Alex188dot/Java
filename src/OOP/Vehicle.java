package OOP;

public class Vehicle {
    public String plate;
    public String model;
    public String owner;
    private final String state;

    /* Exercise: now add a cost property and a method getCost which will print the cost of the car. If the state
    is new add 800€ for fees, if it is used only add 300€.
    Also add a method that calculates the avg cost per km for a trip.

     */

    public int cost;
    public int litersPer100km;

    Vehicle (String plate, String model, String owner, int cost, int litersPer100km) {
        this.plate = plate;
        this.model = model;
        this.owner = owner;
        this.state = "Used";
        this.cost = cost;
        this.litersPer100km = litersPer100km;
    }

    // Overload
    Vehicle (String plate, String model, int cost, int litersPer100km) {
        this.plate = plate;
        this.model = model;
        this.owner = "";
        this.state = "New";
        this.cost = cost;
        this.litersPer100km = litersPer100km;
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

    public double getAvgCost(int km, int litersPer100km) {
        double avgTripCost;
        double gasCostPerLiter = 1.8;
        double totalLiters = ((double) km / 100) * litersPer100km;
        avgTripCost = totalLiters * gasCostPerLiter;
        return avgTripCost;
    }

}
