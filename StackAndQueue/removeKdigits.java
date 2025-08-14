package StackAndQueue;

import StringsBasicMedium.Char;

import java.util.Stack;

public class removeKdigits {
    public static void main(String[] args) {
        System.out.println(Solution("10" ,2));

    }
    public  static  String Solution(String  str , int k ){
        Stack<Character> stack = new Stack<>();
       for (char ch  :  str.toCharArray()){
           while (!stack.isEmpty() && k>0 && (stack.peek()-'0') > (ch-'0')){
               stack.pop();
               k--;
           }
           stack.push(ch);
       }
       if (stack.isEmpty()) return "0";

       while (!stack.isEmpty() && k > 0){
           stack.pop();
           k--;
       }

       StringBuilder  sb = new StringBuilder();
       while (!stack.isEmpty()) sb.append(stack.pop());
       while (!sb.isEmpty() &&  sb.charAt(sb.length()-1)=='0')
           sb.deleteCharAt(sb.length()-1);
       sb.reverse();
        return sb.length() == 0 ? "0" : sb.toString();

    }
}
