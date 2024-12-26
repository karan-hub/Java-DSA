package question;

import java.util.Scanner;


// Find the largest number among 3 numbers
public class LargestOfThree {
    public static void main(String[] args) {
        
        int a = 0, b = 0, c = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
            return;
        }

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {

            max = c;
        }
        System.out.println("The largest number is: " + max);
    }

}
