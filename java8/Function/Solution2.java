package java8.Function;

import java.util.function.Function;

public class Solution2 {
    static Function<Integer , Integer> cube = num->(num*num*num);
    static  Function<Integer , Integer> add5 = num-> num+5;

    public static void main(String[] args) {
        System.out.println(cube.apply(5));
        System.out.println(add5.apply(5));
        System.out.println(cube.andThen(add5).apply(5));
        System.out.println(cube.compose(add5).apply(5));

    }
}
