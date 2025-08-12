package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater2 {
    //    leetCode
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2*n-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i%n])
                stack.pop();
            if ( i < n  )
                nge[i]= stack.isEmpty() ? -1: stack.peek() ;
            stack.push(nums[i%n]);
        }
        return  nge;
    }

    public static void main(String[] args) {
        int [] ar= new int[]{1,2,1};
         int [] result = nextGreaterElements(ar);
        System.out.println(Arrays.toString(result));
    }

}
