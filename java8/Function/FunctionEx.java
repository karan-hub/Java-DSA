package java8.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx {
    /* Function is a functional interface that represents a function which:
       Takes one input of type T
       Returns output of type R*/
    public static void main(String[] args) {
        Function<String, Integer> strLength = s -> s.length();
        System.out.println(strLength.apply("Karan"));  // Output: 5


//        BiFunction
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));  // 30


    }

}
