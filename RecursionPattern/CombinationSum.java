package RecursionPattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {
    public static void main(String[] args) {
        int  []candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans =  combinationSum( candidates, target);
        System.out.println(ans);

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates ,  target , 0 , new ArrayList<>() ,result , new HashSet<>());
        return result;
    }
    public  static  void helper(int[] candidates, int target , int index , List<Integer> ans , List<List<Integer>> result , Set<List<Integer>> set) {

        if (target == 0  ) {
           if (!set.contains(ans)){
               result.add( new ArrayList<>(ans));
               set.add(new ArrayList<>(ans)) ;
               return;
           }
           return;
        }
        if (index  == candidates.length || target < 0 ) return;

//        include
        ans.add(candidates[index] );
        helper(candidates, target-candidates[index], index+1, ans ,   result , set) ;
//        mul include
        helper(candidates, target-candidates[index], index, ans ,  result , set);
        ans.remove(ans.size()-1);
//        exclude

        helper(candidates, target, index+1, ans , result , set);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public void helper(int[] candidates, int target, int index, List<Integer> ans, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

         ans.add(candidates[index]);
        helper(candidates, target - candidates[index], index, ans, result);
        ans.remove(ans.size() - 1);


        helper(candidates, target, index + 1, ans, result);
    }

}
