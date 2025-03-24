package BasicMaths;

public class Value {
    public static void main(String[] args) {
        int [] arr = new int[]{3,1,2};
        System.out.println(min(-1, -100 , arr));

    }

    public static int min(int a, int b , int[] nums) {

        // if (a<b) return a;
        // return b;
        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        int mid = (start + end) / 2;
        if (nums[start] <= nums[mid] && nums[mid] <= nums[end] && nums[start] <= nums[end]) {
            return nums[start];
        }
        System.out.println("out "+ ans);
        return  ans ;
    }
}
