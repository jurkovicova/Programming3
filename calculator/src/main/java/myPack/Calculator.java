package myPack;
public class Calculator {
    public static double runningTotal;

    public static void addition(int b) {
        runningTotal = runningTotal + b;
        System.out.println(runningTotal);
    }

    public static void sub(int b) {
        runningTotal = runningTotal - b;
        System.out.println(runningTotal);
    }

    public static void multiply(int b) {
        runningTotal = runningTotal * b;
        System.out.println(runningTotal);
    }

    public static void div(int b) {
        runningTotal = runningTotal / b;
        System.out.println(runningTotal);
    }
}
