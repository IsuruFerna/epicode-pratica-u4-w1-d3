import entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // es 1
        Rectangle rec1 = new Rectangle(2, 4);
        // rec1.perimeter();
        // rec1.area();

        rec1.stampaRettangolo();

        Rectangle rec2 = new Rectangle(3, 5);

        Rectangle twoRectangles = new Rectangle(rec1, rec2);
        twoRectangles.stampaDueRettangoli();


    }
}