package question;

import java.util.Scanner;

//  find Nth fib number 
public class fibonachi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            int a = 0, b = 1;
            System.out.println("Fibonacci series up to " + n + " terms:");
            System.out.print(a + " " + b);
            int next =0;
            for (int count = 1; count < n; count++) {
                // System.out.println(count);
                  next = a+b;
                System.out.print(" "+ next );
                int temp =b;
                b=next;
                a=temp;

                
            }
            System.out.println();
            System.out.println("the " + n+ " fibonachi number is " + next);
        }

    }
}
