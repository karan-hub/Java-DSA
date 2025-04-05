package StringsBasicMedium;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        RemoveOutermostParentheses obj = new RemoveOutermostParentheses();
        String input = "(()())(())";
        String result = obj.removeOuterParentheses(input);
        System.out.println("Result: " + result);
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
}
