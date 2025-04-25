package RecursionPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        List<String> l =  generateAllParenthesis(3);
        System.out.println(Arrays.toString(l.toArray()));

    }
    public static List<String> generateAllParenthesis(int n) {
        StringBuilder sb = new StringBuilder() ;
        List<String> list = new ArrayList<>() ;
        helper(n , 0 , 0 , sb ,list);
        return  list ;
    }

    static  void helper(int n , int left , int right  ,  StringBuilder sb  , List<String> list){
        if (left+right ==  2*n){
            list.add(sb.toString());
            return;
        }
        if (left < n){
            sb.append('(');
            helper(n, left+1, right, sb, list);
            sb.deleteCharAt(sb.length()-1);
        }
         if (right < left){
            sb.append(')');
            helper(n, left, right+1, sb, list);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}
