package BasicMaths;

public class Armstrongnumber {
    public static void main(String[] args) {
        int number = 153; // Example number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int length = String.valueOf(num).length();

        int result = 0;
        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, length);
            num /= 10;

        }

        return result == original;

    }
}
