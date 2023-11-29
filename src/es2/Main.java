package es2;

public class Main {
    public static void main(String[] args) {
        SIM sim1 = new SIM("1234567890");
        SIM sim2 = new SIM("2345678901");
        SIM sim3 = new SIM("3456789012");

        System.out.println(sim1.toString());
        System.out.println(sim2.toString());
        System.out.println(sim3.toString());
    }
}
