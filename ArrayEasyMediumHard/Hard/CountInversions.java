package ArrayEasyMediumHard.Hard;

public class CountInversions {

    public static void main(String[] args) {
        int[] a = { 5, 3, 2, 4, 1 };
        int cnt = brutForce(a);
        System.out.println("The number of inversions is: " + cnt);

    }

    // O(n)^2
    public static int brutForce(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    ans++;
                }
            }
        }

        return ans;

    }
}