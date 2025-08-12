package StackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreater {
    public int[] nextGreaterElement( int[] nums) {
        int[] nge  = new int[nums.length];
        Stack<Integer> stack =  new Stack<>();
        for (int i = nums.length-1; i >=0 ; i--){
            while (!stack.isEmpty() && stack.peek() <= nums[i])
                stack.pop();
            if (stack.isEmpty())
                nge[i]= -1;
            else
                nge[i]=stack.peek();
            stack.push(nums[i]);
        }
        return  nge;
    }

    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ngeMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= num)
                stack.pop();

            if (stack.isEmpty())
                ngeMap.put(num, -1);
            else
                ngeMap.put(num, stack.peek());

            stack.push(num);
        }

        // Step 2: Build result for nums1 from the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = ngeMap.get(nums1[i]);
        }

        return result;
    }


}
