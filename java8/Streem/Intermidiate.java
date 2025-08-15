package java8.Streem;

import java.util.List;

public class Intermidiate {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6);
        nums.stream()
                .filter(n -> n % 2 == 0) // Even numbers select
                .forEach(System.out::println);

        System.out.println();
        List<String> names = List.of("karan", "bhaiya");
        names.stream()
                .map(String::toUpperCase) // sab ko uppercase me badal do
                .forEach(System.out::println);

        System.out.println();
        System.out.println("sorted");
        List<Integer> nums2 = List.of(5,1,4,2);
        nums2.stream()
                .sorted()
                .forEach(x-> System.out.print(x+" "));

        System.out.println();
        System.out.println("distinct");
        List<Integer> nums3 = List.of(1,2,2,3,3,4);
        nums.stream()
                .distinct()
                .forEach(x-> System.out.print(x+" "));

        System.out.println();
        System.out.println("limit");
        nums.stream()
                .limit(3)
                .forEach(x-> System.out.print(x+" "));

        System.out.println();
        System.out.println("Skips");
        nums.stream()
                .skip(2)
                .forEach(x-> System.out.print(x+" "));

    }
}
