package es1;

import static es1.Rectangle.stampaDueRettangoli1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // es 1
        Rectangle rec1 = new Rectangle(2, 4);
        Rectangle rec2 = new Rectangle(3, 5);
        rec1.stampaRettangolo();

        // use of non-static methods
        Rectangle twoRectangles = new Rectangle(rec1, rec2);
        twoRectangles.stampaDueRettangoli();

        // use of static method
        stampaDueRettangoli1(rec1, rec2);

    }
}