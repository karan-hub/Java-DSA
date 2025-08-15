package java8.Streem;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Terminal {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3);
        nums.stream()
                .forEach(System.out::println);

        List<Integer> evens = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        int sum = nums.stream()
                .reduce(0, (a,b) -> a + b);
        System.out.println(sum);

        long count = nums.stream().count();

        Optional<Integer> min = nums.stream().min(Integer::compareTo);

        boolean hasEven = nums.stream().anyMatch(n -> n % 2 == 0);

        Optional<Integer> first = nums.stream().findFirst();

    }
}
