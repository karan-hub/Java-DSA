package BasicMaths;

public class Reverce {
    public static void main(String[] args) {
        Reverce rev = new Reverce();
        int number = -12345;
        int reversedNumber = rev.reverse(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public int reverse(int x) {
        int result = 0;
        // int sign = x < 0 ? -1:1 ;
        int sign = x < 0 ? -1 : 1;
        while (x != 0) {

            int remender = x % 10;
            x /= 10;

            result = result * 10 + remender;

        }
        return result * sign;

    }
}
