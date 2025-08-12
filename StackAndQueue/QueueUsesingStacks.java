package StackAndQueue;

import java.util.Stack;

public class QueueUsesingStacks<T> {
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(stack2.empty()){
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek() {
        if(stack2.empty()){
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
