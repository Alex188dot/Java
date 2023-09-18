package Inheritance_Exercise;

public class Product_start {

    public static void main(String[] args) {
        Product p1 = new Product("PlayStation", "PlayStation 5 Console", 499);
        System.out.println(p1);
        FoodProduct f1 = new FoodProduct("Cheese", "Some delicious cheese", 5, "19/09/2023");

        System.out.println(f1);
        f1.printExpirationDate();

        f1.calculateDiscount();
        System.out.println(f1);

        System.out.println(f1.getDaysUntilExpiration());


    }
}
