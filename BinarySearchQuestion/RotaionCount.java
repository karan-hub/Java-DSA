package BinarySearchQuestion;

public class RotaionCount {
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int rotationCount = Rotaion(nums);
        System.out.println("Rotation count is: " + rotationCount);
        
    }

    static int Rotaion(int[] nums) {

         int pivote = searchPivot(nums);
         if (pivote ==-1) {
            return 0;
         }
         return pivote+1;
    }

    public static int searchPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

            return -1;
        }

}
