package StackAndQueue;

import java.util.List;

public class GameOfStack {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        if ( a.isEmpty() && b.isEmpty() ) return 0 ;
        return  helper(a, b , maxSum ,0 ,0);
    }

    public static int helper( List<Integer> a, List<Integer> b , int maxSum , int count , int currectSum) {
        if(currectSum > maxSum) return  count-1;

        int maxCount = count ;
        if (!a.isEmpty()) {
            maxCount = Math.max(maxCount, helper(a.subList(1,a.size()) , b , maxSum , count+1 , currectSum+a.get(0) ));
        }
        if (!b.isEmpty()) {
            maxCount= Math.max(maxCount,helper(a , b.subList(1,b.size()) , maxSum , count+1 ,currectSum+b.get(0) ));

        }
        return   maxCount;

    }





}
