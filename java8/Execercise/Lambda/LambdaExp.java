package java8.Execercise.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExp {

//    Without Lambda
      public  static void   Alphabets(List<String> list){
          list.forEach(new Consumer<String>() {
              @Override
              public void accept(String s) {
                  System.out.print(s+" ");
              }
          });
          System.out.println();
      }


//  Consumer<Character> consumer = (s)-> System.out.println(s);
     static Consumer<List<String>> consumer = x -> {
          for (String s : x) {
              System.out.print(s+" ");
          }
      };


    public static void main(String[] args) {
        List<String>  list = Arrays.asList("A","B","C","D","E","F");
        Alphabets(list);

        consumer.accept(list);
    }



}
