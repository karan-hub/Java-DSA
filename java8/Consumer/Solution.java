package java8.Consumer;

import java.util.function.Consumer;

public class Solution {
    static Consumer<String> convertUpperCase =  str-> System.out.println(str.toUpperCase());
    static Consumer<String> firstLetter =  str-> System.out.println(str.replace('k' ,'k'));
    static Consumer<String> getLength =  str-> System.out.println(str.length());

    public static void main(String[] args) {
        String name = "karan";
//        convertUpperCase.accept(name);
        convertUpperCase.andThen(getLength).accept(name);

    }
}
