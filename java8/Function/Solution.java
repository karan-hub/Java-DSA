package java8.Function;

import java.util.function.Function;

public class Solution {
    static Function<String , Integer> lengthOf= String::length;
    static Function<Integer , Integer> squreOf= num->num*num;


    public static void main(String[] args) {
        String  name ="karan";
        System.out.println(lengthOf.apply(name));
        System.out.println(lengthOf.andThen(squreOf).apply(name));
        System.out.println(squreOf.compose(lengthOf).apply(name));
    }
}
