package RecursionPattern;

import java.util.ArrayList;
import java.util.List;


public class PalindromePartitioning {
    public static void main(String[] args) {

        List<List<String>> ans = partition("aab");
        System.out.println(ans);
    }
    public  static  List<List<String>> partition(String s) {
        List<String> Allpartition = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        helper(s, Allpartition , ans);
        return   ans ;
    }
    public  static   void helper(String s , List<String> Allpartition , List<List<String>> ans ) {
        if (s.isEmpty()) {
            ans.add(new ArrayList<>(Allpartition));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(0 ,i+1);
            if (isPalindrome(sub)){
                Allpartition.add(sub);
                helper(s.substring(i+1), Allpartition, ans);
                Allpartition.remove(Allpartition.size()-1);
            }

        }

    }

    public static boolean isPalindrome(String sub) {
        int left = 0, right = sub.length() - 1;
        while (left < right) {
            if (sub.charAt(left) != sub.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }



}
