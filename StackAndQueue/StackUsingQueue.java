package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        int size =queue.size();
        while (size >1){
            queue.add(queue.remove());
            size--;
        }
    }
    public int pop() {
      return   queue.remove();
    }
    public int top() {
        if (queue.isEmpty()) return 0;
        return queue.peek(); // top element
    }
    public boolean empty() {
        return queue.isEmpty();
    }

}
