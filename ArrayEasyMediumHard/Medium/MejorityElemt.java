package ArrayEasyMediumHard.Medium;

public class MejorityElemt {

    public static void main(String[] args) {
        int[] nums = {  1,2,2,1,1};
        int result = Mejority(nums);
        System.out.println("The majority element is: " + result);

    }

    public static int Mejority(int[] nums) {

        int frequency = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if (frequency == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                frequency++;

            } else {
                frequency--;
            }
        }
        return ans;

    }
}