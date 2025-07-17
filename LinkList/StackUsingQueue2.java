package LinkList;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue2 {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int x) {
            q1.add(x); // always add to q1
        }

        public int pop() {
            // Leave last element in q1, push rest to q2
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int top = q1.remove();

            // swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        public int top() {
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int top = q1.remove();
            q2.add(top); // reinsert top

            // swap
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        public boolean empty() {
            return q1.isEmpty();
        }
}
