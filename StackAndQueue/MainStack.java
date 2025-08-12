package StackAndQueue;
public class MainStack {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>(3);
        ArrayStack<Integer> i = new ArrayStack<>();

        try {

//            Custom stack using array

//            stack.push("DJ");
//            stack.push("Karan");
//            stack.push("Bhaiya");
//
//            System.out.println("Top: " + stack.top());
//            System.out.println("Pop: " + stack.pop());
//            System.out.println("Pop: " + stack.pop());
//            System.out.println("Size: " + stack.size());

//            i.push(20);
//            i.push(2);
//            while (!(i.isEmpty())){
//                System.out.println(i.pop());
//            }

        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
