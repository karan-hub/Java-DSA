package Linear_Search;

public class EvenNumberofDigits {

    public static void main(String[] args) {

        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(digits(nums[i]))) {
                res++;
            }
        }
        return res;
    }

    static boolean even(int count) {
       
        return count % 2 == 0;
    }

    public static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;

    }

}