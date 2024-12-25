import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");
            int num = sc.nextInt(); // Correct usage
            for (int i = 0; i <= num; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                    System.out.println();
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }
}