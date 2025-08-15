package java8.Streem;

import java.util.List;

public class ParallelExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.parallelStream()
                .forEach(n -> {
                    System.out.println(Thread.currentThread().getName() + " processing " + n);
                });

        System.out.println("order");
        list.parallelStream()
                .forEachOrdered(System.out::println);

    }
}
