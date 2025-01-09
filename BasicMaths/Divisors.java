package BasicMaths;

import java.util.ArrayList;

public class Divisors {
    public static void main(String[] args) {
        int n = 4;
        int divisors = sumOfDivisors(n);

        System.out.println("Divisors of " + n + " are: " + divisors);

    }

    public static Integer[] divisorsOfNum(int n) {

        int sqrt = (int) Math.sqrt(n);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                result.add(i);
                if (n / i != i) {
                    result.add(n / i);
                }

            }
            // System.out.println(i);

        }

        return result.toArray(new Integer[0]);
    }

    public static int sumOfDivisors(int n) {
        // code here
        int sqrt = (int) Math.sqrt(n);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int prev = 0;
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {

                prev +=i;
                result.add(prev);
                if (n / i != i) {
                    prev += n / i;
                    result.add(n / i);
                }

            }
        }

        int sum = 0;
        for (Integer i : result) {
            sum += i;  
        }

        return sum;
    }
}
