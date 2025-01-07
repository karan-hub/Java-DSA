package BasicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int number = 12;
        int result = evenlyDivides(number);
        System.out.println("Number of digits that evenly divide " + number + " is: " + result);
    }

    static int evenlyDivides(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                continue;
            } else if (n % digit == 0) {
                count++;
            }
            n /= 10;

        }

        return count;
        // code here
    }
}
