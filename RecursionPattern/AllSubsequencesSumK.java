package RecursionPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class AllSubsequencesSumK {
    public static void main(String[] args) {

        int []nums =  {1, 2, 3, 4, 5};
        int k = 8;
         int result = countSubsequenceWithTargetSum(nums , k);
        System.out.println( result);


    }

    public static int countSubsequenceWithTargetSum(int[] nums, int k)
    {
//        int[] count = new int[1]; // mutable
//        helper(nums, k, 0, 0, count, new ArrayList<>());
//        return count[0];
        return  helper2(nums, k, 0, 0 );


    }

    public  static  void helper(int[] nums, int k , int current_sum , int index  , int[] count  , ArrayList<Integer> list ) {

       if (index == nums.length){
           if (current_sum ==  k){
               count[0]++;
//               System.out.println(Arrays.toString(list.toArray()));
               System.out.println(list);
//               return;

           }
           return;
       }

        current_sum += nums[index];
        list.add(nums[index] );
        helper(nums, k, current_sum, index+1, count, list);
        current_sum -= nums[index];
        list.remove(list.size()-1);

        helper(nums, k, current_sum, index+1, count, list);


    }




    public  static  int helper2(int[] nums, int k , int current_sum , int index ) {

        if (index == nums.length)  return (current_sum ==  k )? 1 :0 ;

        int include  =  helper2(nums, k, current_sum + nums[index], index+1);

        int exclude = helper2(nums, k, current_sum , index+1);

        return  include+exclude;
    }
}
