package RecursionPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {

        int [] candidates = {10,1,2,7,6,1,5} ;
        int target = 8;
        List<List<Integer>> rs =    combinationSum2(candidates , target);
         for (List<Integer> l : rs) System.out.println(l);

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates ,  target , 0 , new ArrayList<>() , result);
        return result;
    }

    public  static  void    helper(int  [] candidates , int   target ,int index  , List<Integer> ds ,  List<List<Integer>> result ) {
        if (target < 0 ) return;

        if (target == 0 ){
            result.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i-1]) continue;
//            if (candidates[i] > target) break;

            ds.add(candidates[i]);
            helper(candidates, target-candidates[i], i+1, ds, result);
            ds.remove(ds.size()-1);

        }

    }
}
