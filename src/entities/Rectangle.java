package entities;

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

    public String perimeter() {
       return "perimeter: " + (2 * (length + width));
    }

    public String area() {
        return "area: " + (length * width);
    }

    public void stampaRettangolo() {
        System.out.println(this.perimeter() + " " + this.area());
    }

    public void stampaDueRettangoli() {


        System.out.println("reactangle 1 perimeter: " + this.rectangle1.perimeter());
        System.out.println("reactangle 2 perimeter: " + this.rectangle1.perimeter());
        System.out.println("reactangle 1 area: " + this.rectangle1.area());
        System.out.println("reactangle 2 area: " + this.rectangle2.area());
        System.out.println("sum perimeter: " + (this.rectangle2.perimeter() + this.rectangle1.perimeter()));
        System.out.println("sum area: " + (this.rectangle2.area() + this.rectangle1.area()));
    }
}
