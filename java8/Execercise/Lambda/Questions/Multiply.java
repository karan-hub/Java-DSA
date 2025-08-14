package java8.Execercise.Lambda.Questions;

import java.util.function.Function;

public class Multiply {

    static  Function<Integer , Integer> multiplyBy10 = (t)-> t*10;
    private static Function< Integer, Integer> add10= t->t+10;
    static  Function<Integer , Integer> MultiplyThenAdd = multiplyBy10.andThen(add10);

    static  Function<Integer , Integer> beforeMultiplyAdd10 = multiplyBy10.compose(add10);
    public static void main(String[] args) {
        System.out.println(MultiplyThenAdd.apply(10));
        System.out.println(beforeMultiplyAdd10.apply(10));
    }
}
