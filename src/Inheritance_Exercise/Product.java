package Inheritance_Exercise;


/*
Create a class called Product with the following fields: barCode, description, price.
Then create two subclasses: FoodProduct and NonFoodProduct. For the FoodProduct class,
add a field called expirationDate. For the NonFoodProduct class, add a field called material.
For the FoodProduct class, override the toString method and print the expiration date and create a
method to calculate the discount: if the expiration date is less than or equal to 10 days, apply a 20% discount.
For the NonFoodProduct class, override the toString method and print the material.

 */


public class Product {
    private String barCode;
    private String description;
    private double price;


    public Product(String barCode, String description, double price) {
        this.setBarCode(barCode);
        this.setDescription(description);
        this.setPrice(price);
    }



    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return getBarCode() + " - " + getDescription() + " - " + getPrice();
    }

  public void applyDiscount(){
      this.setPrice((double) (this.getPrice() * 0.95));
  }
}

