package es1;

public class Rectangle {
    double length;
    double width;
    Rectangle rectangle1;
    Rectangle rectangle2;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle1, Rectangle rectangle2) {
        this.rectangle1 = rectangle1;
        this.rectangle2 = rectangle2;
    }

    public double perimeter() {
       return (2 * (length + width));
    }

    public double area() {
        return length * width;
    }

    public void stampaRettangolo() {
        System.out.println("perimeter: " + this.perimeter() + " area: " + this.area());
    }

    // non-static method
    public void stampaDueRettangoli() {
        System.out.println("reactangle 1 perimeter: " + this.rectangle1.perimeter());
        System.out.println("reactangle 2 perimeter: " + this.rectangle1.perimeter());
        System.out.println("reactangle 1 area: " + this.rectangle1.area());
        System.out.println("reactangle 2 area: " + this.rectangle2.area());
        System.out.println("sum perimeter: " + (this.rectangle2.perimeter() + this.rectangle1.perimeter()));
        System.out.println("sum area: " + (this.rectangle2.area() + this.rectangle1.area()));
    }

    // static method
    public static void stampaDueRettangoli1(Rectangle rectangle1, Rectangle rectangle2) {
        System.out.println("sum parimeter_: " + (rectangle2.perimeter() + rectangle1.perimeter()));
        System.out.println("sum area_: " + (rectangle2.area() + rectangle1.area()));
    }
}
