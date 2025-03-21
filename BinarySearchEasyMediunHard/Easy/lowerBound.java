 


package BinarySearchEasyMediunHard.Easy;

public class lowerBound {
    public static int Search(int target, int[] nums , int n) {
        int start = 0;
        int end = nums.length - 1;
        int ans =n ;
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

    public static void main(String[] args) {
        // ceil
        int[] nums = {5, 6, 8, 9, 6, 5, 5, 6};
        int target = 7;
        System.out.println(Search(target, nums , nums.length));
       

    }

}