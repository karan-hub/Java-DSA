package java8.UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Solution {
    static  UnaryOperator<List<String>> addElement = list -> {
        list.add("Aarti");
        list.add("Aarti");
        return list;
    };
    public static void main(String[] args) {
        System.out.println(addElement.apply(new ArrayList<>(List.of("karan"))));
    }
}
