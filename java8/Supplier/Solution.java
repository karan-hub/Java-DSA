package java8.Supplier;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.function.Supplier;

public class Solution {
    static Supplier<Integer> getRandom = ()-> (int) Math.floor(Math.random()*100);
    static Supplier<LocalDate> getDate = LocalDate::now;

    public static void main(String[] args) {
        System.out.println(getRandom.get());
        System.out.println(getDate.get());

    }
}
