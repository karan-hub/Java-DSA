package BinarySearchEasyMediunHard.Easy;

public class UpperBound {
    public static void main(String[] args) {
        int[] nums = {5 ,12 ,12 ,15 ,18 ,21 ,35 ,37 ,38 ,46 ,47 ,48 ,48 ,50 };
        int target = 45;
        System.out.println(Search(target, nums, nums.length));

    }

    private static int Search(int target, int[] nums, int length) {
        int start = 0;
        int end = nums.length - 1;
        int ans = length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(nums[mid]);
            if (nums[mid] > target) {
                ans =  mid;
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return ans;
    }
}
