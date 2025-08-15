package java8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        List<String> students= Arrays.asList("karan" , "kishor" , "prathamesh" , "aur kuchh") ;
        Consumer<List<String>> print = x ->{
            for (String nm:x)  System.out.println(nm);
        };

        print.accept(students);

        Consumer<String> greet = System.out::println;
        Consumer<String> bye = name -> System.out.println("Goodbye " + name);

        Consumer<String> combo = greet.andThen(bye);
        combo.accept("Karan bhaiya");

//        BiConsumer
        BiConsumer<String, Integer> printPerson = (name, age) ->
                System.out.println(name + " is " + age + " years old.");
        printPerson.accept("Karan  ", 22);

    }
}
