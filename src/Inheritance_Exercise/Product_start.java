package Inheritance_Exercise;

public class Product_start {

    public static void main(String[] args) {
        FoodProduct f1 = new FoodProduct("Cheese", "Some delicious cheese", 5, "19/09/2023");

        System.out.println(f1);
        f1.printExpirationDate();

        f1.calculateDiscount();
        System.out.println(f1);

        System.out.println(f1.getDaysUntilExpiration());


    }
}
