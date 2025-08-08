package java8;

public class lambda {

    public static void main(String[] args) {
        MathOperation power = (x , y )-> x*y;
        System.out.println(power.operate(2 ,2));
        MathOperation  sub = ( int x , int y  ) -> x-y;
        System.out.println(sub.operate(10,5));
    }
}

@FunctionalInterface
interface MathOperation{
      int operate(int a , int b);
}