package RecursionPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStrings {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);

    }

    public  static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result =  new ArrayList<>();
        List<Integer> in = new ArrayList<>() ;
        helper( nums  , result , in ,0);
        return  result ;

    }
    public  static  void    helper(int[] nums  , List<List<Integer>>  result , List<Integer> in , int i) {
        if ( i == nums.length) {
            result.add(new ArrayList<>(in));
            return ;
        }

        in.add(nums[i]);
        helper(nums  ,  result ,  in , i+1);
        in.remove(in.size()-1);
        helper(nums  ,  result ,  in , i+1);

    }

}
