package logic;

public class CountingLoop {

    public static void countingWithWhileLoop() {
        double i = 0;
        while (i <= 3.1) {
            System.out.printf("%.1f\n", i);
            i += 0.1;
        }
    }

    public static void countingWithDoWhileLoop() {
        double i = 0;
        do {
            System.out.printf("%.1f\n", i);
            i += 0.1;
        } while (i <= 3.1);
    }

}
