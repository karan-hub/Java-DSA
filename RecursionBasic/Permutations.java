package RecursionBasic;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
//        List<List<Integer>>  r =permute(nums);
//        System.out.println(r);







    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans  = new ArrayList<>();
        int index = 0 ;
        solve(nums , index, ans);
        return  ans ;
    }

    private  static  void solve(int[] nums, int index, List<List<Integer>> ans) {
        if (index >= nums.length){
            List<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);  // Create a copy of the array
            }
            ans.add(current);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums , index, i);
            solve(nums, index+1, ans);
            swap(nums , index, i);
        }
    }

    private static void swap( int [] nums,int index, int i) {
        int temp =  nums[index];
        nums[index]= nums[i];
        nums[i]= temp;
    }


//    for repeted nums


}
