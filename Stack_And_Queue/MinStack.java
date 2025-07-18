package Stack_And_Queue;

import java.util.Stack;

public class MinStack {
Stack<Integer> stack = new Stack<>();
int min;
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            min=val;
        }
        else
            if (val>= min )
                stack.push(val);
            else {
                stack.push(2 * val - min);
                min=val;
            }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top <  min) min = (2 * min) - top;
     }

    public int top() {
        if (stack.isEmpty()) return 0;
        int top= stack.peek();
        if (top < min) return min;
        else  return  top;
    }

    public int getMin() {
            if (stack.isEmpty()) return 0 ;
          return  min;
    }
}
