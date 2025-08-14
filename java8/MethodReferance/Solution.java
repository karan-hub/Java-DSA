package java8.MethodReferance;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Solution {


    static int Squre(int num){
        return num*num;
    }
    public String greet() {
        return "Hello Karan Bhaiya!";
    }
    Solution(){
        System.out.println("Customer called");
    }

    public static void main(String[] args) {
//        Static
        Function<Integer, Integer> and = Solution::Squre;
        System.out.println(and.apply(5));

//        Constructor
       Supplier<Solution> con = Solution::new;

//        Instance Method
        Solution solution = new Solution();
        Supplier<String> getgreet =  solution::greet;
        System.out.println(getgreet.get());


    }
}
