package BinarySearchEasyMediunHard.Easy;

public class Insert {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        System.out.println(Search(target, nums, nums.length));

    }

    private static int Search(int target, int[] nums, int length) {

        int start = 0;
        int end = nums.length - 1;
        int ans =length ;
        // int mid = start + (end - start)/2;
        while (end >= start) {
            int mid = start + (end - start)/2;
            if (nums[mid] >= target) {
                // return mid ;
                ans = mid;
                end = mid -1;
            }else if (target > nums[mid]) {
                start = mid+1;
            }else{
                end = mid -1;
            }

        }

        return ans;
    }
}
