package java8.Execercise.Lambda.Questions;

import java.util.function.Consumer;

public class StringLength {
    static Consumer<String> legthOf = (x)-> System.out.println(x.length());
    public static void main(String[] args) {
        String name =  "karan";
        legthOf.accept(name);
    }
}
