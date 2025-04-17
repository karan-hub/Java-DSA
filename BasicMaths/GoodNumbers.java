package BasicMaths;

public class GoodNumbers {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1));

    }
    static final int MOD = 1_000_000_007;

    public static int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long frist = pow(5, even);
        long second = pow(4, odd);
        return (int) ((frist * second) % MOD);
    }

    static long pow(long base, long power) {
        long result = 1;
        base %= MOD;

        while (power > 0) {
            if (power % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            power /= 2;
        }

        return result;
    }


}
