package java8;

import java.util.function.Consumer;

public class MethodReferance {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        // Instead of:
        Consumer<String> c = name->  greeter.greet(name);

        // Do:
        Consumer<String> c2 = greeter::greet;
        c2.accept("Karan Bhaiya");

    }
}



class Greeter {
    public void greet(String name) {
        Consumer<String> print= System.out::println;
        print.accept("karan");

    }
}