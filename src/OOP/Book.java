package OOP;

public class Book {

    /*
    Exercise: Create a Book class with Title, Author and year of publishing
    1) Create the constructor
    2) Create getters and setters
    3) Create the toString method
     */

    private String title;
    private String author;
    private int year;

    public Book (String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void  setYear(int year) {
        this.year = year;
    }



    public String toString() {
        return ("Title: " + title + "; Author: " + author + "; Year: " + year);
    }
}
