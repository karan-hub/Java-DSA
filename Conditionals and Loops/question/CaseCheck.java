package question;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char ch = scanner.next().trim().charAt(0);

            if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + " is lowercase.");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + " is uppercase.");
            } else {
                System.out.println(ch + " is not an alphabetic character.");
            }
        }
    }
}
