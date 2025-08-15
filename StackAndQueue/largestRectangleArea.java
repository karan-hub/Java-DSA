package StackAndQueue;



import java.util.Stack;

public class largestRectangleArea {
    public  static int  Solution(int [] arr){
        Stack<Integer> stack = new Stack<>();
        int max = 0 ;
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                int element = arr[stack.pop()];
                int pse=(stack.isEmpty())?-1:stack.peek();
                max = Math.max(max,(element*(i - pse - 1)));
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int element = arr[stack.pop()];
            int pse=(stack.isEmpty())?-1:stack.peek();
            max = Math.max(max,(element*(arr.length - pse-1)));
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(Solution(new int[]{2,1,5,6,2,3}));

    }
}
