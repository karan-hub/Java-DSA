package RecursionPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class subsetSums2 {
    public static void main(String[] args) {
        int [] nums = {1,2,2};

        List<List<Integer>> res = subsetSums(nums);
        System.out.println(res);
    }

    public   static  List<List<Integer>>  subsetSums(int[] nums) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums  , 0 , ans , new ArrayList<>());

//        Collections.sort(ans);
        return ans ;

    }

    public  static  void helper(int[] nums ,  int index    ,  List<List<Integer>> ans , List<Integer> ds) {

            if (index == nums.length) {
                ans.add( new ArrayList<>(ds));
                return;
            }

            //   Skip duplicates

            ds.add(nums[index]);
            helper(nums, index + 1, ans, ds);
            ds.remove(ds.size() - 1);

            int i = index+1;
            while ( i < nums.length  && nums[i] == nums[i - 1]) i ++;
            helper(nums, i, ans, ds);

        }


    }



