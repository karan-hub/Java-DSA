package java8.BinaryOperator;

import java.util.function.BinaryOperator;

public class Solution {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 7)); // 12
    }
}
