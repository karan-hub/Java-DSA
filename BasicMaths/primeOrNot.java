package BasicMaths;
import java.lang.Math;
public class primeOrNot {
    public static void main(String[] args) {
        int number = 5; // You can change this to any number you want to check
        if (OptimalApproch(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
    }

    private static boolean OptimalApproch(int number) {
        
        for(int  i = 2 ; i <= (int) Math.sqrt(number);i++ ){
            if(number % i == 0){
                 return false;
            }
        }
        return true;    

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                continue;
            }
            if (num % i == 0 && i != 1 && i != num) {
                return false;

            }
        }

        return true;
    }

}
