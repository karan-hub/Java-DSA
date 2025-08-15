package java8.Streem;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Create {
    public static void main(String[] args) {
//      Ways To Create Stream
//      Collection.stream()
        System.out.println("Collection.stream()");
        List<Integer> number = Arrays.asList(1,2,3,4);
        number.stream()
                .filter(x->x%2==0)
                .map((a)->a*a)
                .forEach(System.out::println);
//    Arrays.stream()
        System.out.println("Arrays.stream()");
           int[] arr = new int[]{1,2,3,45,6,7};
           Long result=Arrays.stream(arr)
                   .filter(x->x%2==0)
                   .count();
        System.out.println(result);
//        Stream.of(values...)
        System.out.println("Stream.of(values...)");
        Stream.of("karan" ,"Prerana" , "Mangesh" ," Anju" ,"Manju")
                .filter(x->x.length()>5)
                .forEach(System.out::println);


//    infinite Stream   Stream.generate(()->) takes supplier
//        Stream.generate(()->2*2)
//                .forEach(System.out::println);

//        stream.iterator()
        System.out.print("stream.iterator() ");
        Stream.iterate(0, n -> n + 2)
                .limit(5)
                .forEach(System.out::print);

        System.out.println();

        System.out.println("9+ stream.iterator()");
        Stream.iterate(0,j->j<=50,n->n+5).forEach(x->System.out.print(x+" "));


    }
}
