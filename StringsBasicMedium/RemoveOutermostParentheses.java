package StringsBasicMedium;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        RemoveOutermostParentheses obj = new RemoveOutermostParentheses();
        String input = "(()())(())";
        String result = obj.removeOuterParentheses(input);
        System.out.println("Result: " + result);
        String resultStack = obj.removeOuterParenthesesstack(input);
        System.out.println("Result using stack: " + resultStack);

    }
    public String removeOuterParentheses(String s) {
        int count =0 ;
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')') count --;
            if(count !=0 ) ans+=s.charAt(i);
            if(s.charAt(i) == '(') count ++;

        }
        return ans;
    }
    public String removeOuterParenthesesstack(String s) {
        Stack<Character> st = new Stack<>();
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                if (!st.isEmpty()) ans+=s.charAt(i);
                st.push(s.charAt(i));
            }
            if(s.charAt(i) == ')') {
                st.pop();
                if (!st.isEmpty()) ans+=s.charAt(i);
            }
            

        }
        return ans;
    }
}
