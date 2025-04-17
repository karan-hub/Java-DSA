package RecursionBasic;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Stack;

public class ReverceStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Before  reverse : - " + stack);
        reverse(stack);
        System.out.println("After  reverse : - " + stack);


    }

    static  void reverse(Stack<Integer>  stack){
        if(stack.isEmpty()) return;
        int top = stack.pop();
         reverse(stack );
         insert_at_bottom(stack,top);

    }

    static  void  insert_at_bottom(Stack<Integer> stack , int element){
        if (stack.isEmpty()){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insert_at_bottom(stack,element);
        stack.push(top);
    }
}
