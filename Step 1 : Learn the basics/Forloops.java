import java.util.Scanner;

public class Forloops {
    public static void main(String[] args) {
        int nth = 6; // Example value
        int result = fib(nth);
        Scanner
        System.out.println("The " + nth + "th Fibonacci number is: " + result);
    }

    public static int fib(int nth) {
        if (nth == 1 || nth == 2) {
            return 1;
        }

        int a = 1;
        int b = 1;

        int result = 0;
        for (int i = 3; i <= nth; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

}
