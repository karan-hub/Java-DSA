package c3;

import java.util.Stack;

public class exp {

    public static void main(String[] args) {
        String que = "5+6";
        System.out.println(result(que));
    }

    static int result(String que) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < que.length(); i++) {
            
                int digit = Character.getNumericValue(que.charAt(i));
                if ( digit == -1) {
                    // System.out.println(que.charAt(i));
                 }else{
                    s.push(digit);
                }

 

        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }
        return 0;
    }
}
