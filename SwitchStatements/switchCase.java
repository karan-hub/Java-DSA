package SwitchStatements;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String fruits = scanner.next();
            switch (fruits) {
                case "mango":
                    System.out.println("king of fruits");
                    break;
                case "greps":
                    System.out.println("small fruit");

                case "pineApple":
                    System.out.println("favourite fruit");
                default:
                    System.out.println("this is not choice");
                    break;
            }
        }
    }
}
