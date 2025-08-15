package java8.Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateEx {
/*    A Predicate is a functional interface in java.util.function package,
   that represents a boolean-valued function of one argument.
  */
public static void main(String[] args) {
    Predicate<String> gt5 = s -> s.length() >=5;
//    System.out.println(gt5.test("karan"));

//    AND
    Predicate<Integer> gt50 = x -> x>=50;
    Predicate<Integer> div = x -> x%5 == 0;
//    System.out.println(gt50.and(div).test(50));
    Predicate<Integer> and  =  gt50.and(div) ;
//    System.out.println(and.test(50));

//    OR
    Predicate<String> srtA = x -> x.toLowerCase().startsWith("a");
    Predicate<String> srtK = x -> x.toLowerCase().startsWith("k");
    Predicate<String > strAorK = srtK.or(srtA);
    System.out.println(strAorK.test("karan"));

//BiPredicate
    BiPredicate<Integer, Integer> isSumGreaterThan100 = (a, b) -> (a + b) > 100;
    System.out.println(isSumGreaterThan100.test(60, 45));  // true

}
}
