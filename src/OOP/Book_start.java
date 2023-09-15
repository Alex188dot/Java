package OOP;

public class Book_start {
    public static void main(String[] args) {

        Book b1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 2017 );

        System.out.println(b1);
        System.out.println(b1.getAuthor());
        b1.setAuthor("Stephen King");
        System.out.println(b1.getAuthor());
        b1.setAuthor("Robert Kiyosaki");
        System.out.println(b1);

    }
}
