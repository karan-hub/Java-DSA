package java8.UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));  // Output: 25

    }
}
