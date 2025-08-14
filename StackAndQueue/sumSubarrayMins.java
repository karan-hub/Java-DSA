package StackAndQueue;

import java.util.Stack;

public class sumSubarrayMins {
//    Optimal
    public  static int   Solution(int [] arr){
        int [] nse = nextSmallestElement(arr);
        int [] psee= previosSmallestElementEqule(arr);
        long total =0 ;
        int mod = (int)(1e9+7);
        for (int i = 0; i < arr.length; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            total = (total + (long) arr[i] * left * right) % mod;
        }
        return (int) total;
    }

    public static  int[] nextSmallestElement( int[] nums) {
        int[] nge  = new int[nums.length];
        Stack<Integer> stack =  new Stack<>();
            for (int i = nums.length-1; i >=0 ; i--){
                while (!stack.isEmpty() && nums[stack.peek()] >= nums[i])
                    stack.pop();
                nge[i]= stack.isEmpty() ? nums.length :stack.peek();
                stack.push(i);
            }
            return  nge;
        }
    public static int[] previosSmallestElementEqule( int[] nums) {
        int[] nge  = new int[nums.length];
        Stack<Integer> stack =  new Stack<>();
        for (int i = 0 ; i < nums.length ; i++){
            while (!stack.isEmpty() && nums[stack.peek()] >  nums[i])
                stack.pop();
            nge[i]= stack.isEmpty() ? -1 :stack.peek();
            stack.push(i);
        }
        return  nge;
    }

    public static void main(String[] args) {
         int r =Solution(new  int[]{3,1,2,4});
        System.out.println(r);
    }

}
