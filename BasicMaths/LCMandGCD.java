package BasicMaths;

public class LCMandGCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int gcdBetter = BetterApproach(a, b);
        System.out.println("GCD using Better Approach: " + gcdBetter);

        int gcdOptimal = OptimalApproch(a, b);
        System.out.println("GCD using Optimal Approach: " + gcdOptimal);
        int[] lcmAndGcd = lcmAndGcd(a, b);
        System.out.println("LCM: " + lcmAndGcd[0]);
        System.out.println("GCD: " + lcmAndGcd[1]);

    }

    public static int BetterApproach(int a, int b) {

        int result = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public static int OptimalApproch(int a, int b) {
        while (a != 0 && b != 0) {
            int max = Math.max(a, b);
            int min = Math.min(a, b);

            int sub = max - min;
            a = min;
            b = sub;
            if (sub == 0) {
                return min;
            }

        }
        return 0;
    }

    public static int[] lcmAndGcd(int a, int b) {
        int GCD = OptimalApproch(a, b);

        int result = (a * b) / GCD;
        return new int[]{result, GCD};

    }

}
