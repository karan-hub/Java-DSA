package Stack_And_Queue;

import java.util.Stack;

public class QueueUsesingStacks<T> {
    Stack<T> stack1= new Stack<>();
    public void add(T Element){
        stack1.push(Element);
    }
    public T get(){
         Stack<T> stack2 = new Stack<>();
         while(!(stack1.isEmpty())){
             stack2.push(stack1.pop());
         }
         return stack2.pop();
    }
    public  int getSize(){
        return stack1.size();
    }
}
