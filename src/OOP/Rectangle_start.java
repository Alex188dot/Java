package OOP;

public class Rectangle_start {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(-8, -12);

        System.out.println(r1);
        System.out.println(r1.getHeight());
        System.out.println(r1.getWidth());
        System.out.println("R1 area: " + r1.rectangleArea());
        System.out.println("R1 perimeter: " + r1.rectanglePerimeter());

        System.out.println("-----------------");
        System.out.println(r2);
        System.out.println("R1 area: " + r2.rectangleArea());
        System.out.println("R1 perimeter: " + r2.rectanglePerimeter());
        r2.setHeight(-3);
        r2.setWidth(-5);
        System.out.println(r2);
        System.out.println(r2.getHeight());
        System.out.println(r2.getWidth());
        System.out.println("R1 area: " + r2.rectangleArea());
        System.out.println("R1 perimeter: " + r2.rectanglePerimeter());

    }
}