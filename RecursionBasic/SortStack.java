package RecursionBasic;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Input elements
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sort(stack); // Sort using recursion

        System.out.println("Sorted Stack: " + stack);


    }
     static void    sort(Stack<Integer> stack ){
        if (stack.isEmpty()) return;
        int top = stack.pop();
        sort(stack);
        sortedInser(stack , top);
     }

     static   void  sortedInser( Stack<Integer> stack , int ele){
        if (stack.isEmpty() || ele > stack.peek() ){
            stack.push(ele);
            return;
        }
         int top = stack.pop();
        sortedInser(stack , ele);
        stack.push(top);
     }
}
