/* Given an array of integers nums which is sorted in ascending order,
   and an integer target, write a function to search target in nums.
  If target exists, then return its index. Otherwise, return -1.  */

package BinarySearchEasyMediunHard.Easy;

public class findX {
    public static int Search(int target, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        // int mid = start + (end - start)/2;
        while (end >= start) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                return mid ;
            }else if (target > nums[mid]) {
                start = mid+1;
            }else{
                end = mid -1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        int target = 9;
        System.out.println(Search(target, nums));
       

    }

}
