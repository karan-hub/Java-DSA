package RecursionPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class subsetSums1 {
    public static void main(String[] args) {
        int [] nums = {1,2,2};

        List<Integer>  res = subsetSums(nums);
        System.out.println(res);
    }

    public  static List<Integer> subsetSums(int[] nums) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();
        helper(nums  , 0 , 0 , ans);
//        Collections.sort(ans);
        return ans ;

    }

    public  static  void helper(int[] nums ,  int index  , int sum ,  List<Integer> ans) {
        //your code goes here
        if (index ==  nums.length){
            ans.add(sum);
            return;
        }

//        no
        helper(nums, index+1, sum, ans);

//        yes
        helper(nums, index+1, sum+nums[index], ans);


    }




}
