package c3;

import java.util.Stack;

public class Exp {

    public static void main(String[] args) {
        String que = "5+6";
        System.out.println("Result: " + result(que));
    }

    static int result(String que) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char lastOp = '+'; // To store the last operator

        for (int i = 0; i < que.length(); i++) {
            char ch = que.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // Handling multi-digit numbers
            }

            // If an operator is encountered or it's the last character
            if (!Character.isDigit(ch) || i == que.length() - 1) {
                if (lastOp == '+') {
                    stack.push(num);
                } else if (lastOp == '-') {
                    stack.push(-num);
                }

                lastOp = ch; // Update the last operator
                num = 0;  // Reset number
            }
        }

        // Sum up all values in the stack
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
