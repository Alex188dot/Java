package Inheritance_Exercise;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class FoodProduct extends Product {

    public String expirationDate;
    public FoodProduct(String barCode, String description, int price, String expirationDate) {
        super(barCode, description, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return getBarCode() + " - " + getDescription() + " - " + getPrice() + " - " + getExpirationDate();
    }

    public void printExpirationDate(){
        LocalDate date = LocalDate.parse(getExpirationDate(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        DateTimeFormatter itDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Italian date format: " + date.format(itDateFormat));
    }


    public void calculateDiscount() {
        long daysUntilExpiration = getDaysUntilExpiration();
        if (daysUntilExpiration <= 10) {
            this.setPrice((int) (this.getPrice() * 0.8));
        }
    }


    long getDaysUntilExpiration() {
        LocalDate today = LocalDate.now();
        LocalDate expirationDate = LocalDate.parse(getExpirationDate(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long daysUntilExpiration = ChronoUnit.DAYS.between(today, expirationDate);
        return daysUntilExpiration;
    }




}

