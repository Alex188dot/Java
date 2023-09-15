package OOP;

public class Rectangle {
    /*
    Exercise: Create a Rectangle class:
    1) Create the constructor with height and width properties, type: double;
    2) Create getters and setters, check also if the values are positive;
    3) Create the toString method;
    4) Create the methods to calculate the area and the perimeter;

     */

    private int height;
    private int width;

    public Rectangle (int height, int width) {
        this.height = checkSymbol(height);
        this.width = checkSymbol(width);
    }

    public String toString() {
        return ("Height: " + height + "; Width: " + width);
    }

    public int getHeight() {
        return  height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = checkSymbol(height);
    }

    public void setWidth(int width) {
        this.width = checkSymbol(width);
    }

    public int checkSymbol(int num) {
     return num > 0 ? num : Math.abs(num);
    }

    public int rectangleArea() {
        return this.height * this.width;
    }

    public int rectanglePerimeter() {
        return (this.height * 2) + (this.width * 2);
    }
}
