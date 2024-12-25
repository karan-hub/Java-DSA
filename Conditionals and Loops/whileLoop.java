import java.util.Scanner;

public class whileLoop {
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = scanner.nextInt();
            while (i % 5 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}
