package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class asteroidCollision {
    public static void main(String[] args) {
        int [] arr = Solution(new int[]{-2,-2,-1,-2});
        System.out.println(Arrays.toString(arr));

    }

    public  static int[] Solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) stack.push(arr[i]);
            else {
                while (!stack.isEmpty() && stack.peek() >= 0 && stack.peek() < Math.abs(arr[i]))
                    stack.pop();
                if (!stack.isEmpty() && stack.peek() == Math.abs(arr[i]))
                    stack.pop();
                else if (stack.isEmpty() || stack.peek() <= arr[i] || stack.peek() < 0 && stack.peek()> arr[i])
                    stack.push(arr[i]);
            }
        }
        int[] resultArray = new int[stack.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = stack.get(i); // removes and stores
        }
        return resultArray;

    }
}
