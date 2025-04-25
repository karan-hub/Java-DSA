package RecursionPattern;

public class CheckSubsequenceSum {
    public static void main(String[] args) {
        int []nums =  {4, 3, 9, 2};
        int k = 10;
        boolean result = checkSubsequenceSum(nums , k);
        System.out.println( result);
    }

    public static boolean checkSubsequenceSum(int[] nums, int k) {
        //your code goes here
        return  helper2(nums ,  k , 0 , 0 );
    }

    public  static  boolean helper2(int[] nums, int k , int current_sum , int index ) {

        if (index == nums.length)  return current_sum == k;

        if (helper2(nums, k, current_sum + nums[index], index + 1))  return  true ;

        return helper2(nums, k, current_sum, index + 1);
    }
}

