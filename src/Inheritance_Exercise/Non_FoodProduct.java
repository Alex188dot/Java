package Inheritance_Exercise;

public class Non_FoodProduct extends Product {

    public String material;
    public String expirationDate;
    public Non_FoodProduct(String barCode, String description, int price, String material) {
        super(barCode, description, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return getBarCode() + " - " + getDescription() + " - " + getPrice() + " - " + getMaterial();
    }

}
