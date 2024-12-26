package question;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        int ans = 0;
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("enter operator ");
                char op = scanner.next().trim().charAt(0);
                if (op == '+' || op == '-' || op == '/' || op == '%') {
                    System.out.println("enter two number");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();

                    if (op == '+') {
                        ans = num1 + num2;
                    } else if (op == '-') {
                        ans = num1 - num2;
                    } else if (op == '%') {
                        ans = num1 % num2;
                    } else if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }
                    }

                } else if (op == 'X' || op == 'x') {

                    break;
                } else {
                    System.out.println("invalid operation");

                }

                System.out.println(ans);
            }
        }
    }
}
