package ArrayEasyMediumHard.Medium;

public class Sort01s2s {
    public static void main(String[] args) {
        int[] result = swapThreeNumbers(2,2,1);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] swapThreeNumbers(int a, int b, int c) {

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        return new int[] { a, b, c };
    }
}
