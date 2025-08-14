package java8.Execercise.Lambda.Questions;

import java.util.function.Predicate;

public class isDivisible {
    static Predicate<Integer> by10 = n-> n % 10 == 0;
    public static void main(String[] args) {
        System.out.println(by10.test(21));
    }
}
