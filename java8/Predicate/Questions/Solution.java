package java8.Predicate.Questions;

import StringsBasicMedium.Char;
import java8.Predicate.PredicateEx;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Solution {
   static Predicate<String> isUppercase= s -> s.matches("^[A-Z]+$");
   static Predicate<String> isLowercase= s -> s.matches("^[a-z]+$");
   static Predicate<String> isStartWithA= s -> s.startsWith("K");

   static BiPredicate<Integer , Integer> sumIsDivisible = (T,U)->(T+U)%2==0;

    public static void main(String[] args) {

//      AND
        boolean result =isLowercase.and(isStartWithA).test("KARAN");
//        OR
        boolean result2 =isLowercase.or(isStartWithA).test("karan");
//        Negete
        boolean result3 =isLowercase.or(isStartWithA).negate().test("KARAN");
        System.out.println(
                " result 1 - " +result +
                "\n result 2 - " +result2+
                "\n result 3 - "+result3);
//      BiPredicate
        System.out.println(sumIsDivisible.test(10,12));
    }
}
