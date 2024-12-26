package question;

public class findCount {

    public static void main(String[] args) {
        Long n = 2124314132545L;
        int number = 2;
        int count = 0;
        while (n > 0) {
            int remender = (int) (n % 10); // last digit

            if (remender == number) {
                count++;
            }
            n /= 10 ; //   remove last digit 
        }
        System.out.println(count);
    }
}
