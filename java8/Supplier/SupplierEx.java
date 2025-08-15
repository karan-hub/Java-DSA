package java8.Supplier;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<String> giveName = () -> "DJ Karan Bhaiya";
        System.out.println(giveName.get());  // DJ Karan Bhaiya
        Supplier<LocalTime> timeSupplier = () -> LocalTime.now();
        System.out.println("Current time: " + timeSupplier.get());
        Supplier<LocalDate> deteSuppler = ()->LocalDate.now();
        System.out.println("Current Date: " + deteSuppler.get());



    }
}
