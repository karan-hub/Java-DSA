package RecursionBasic;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {

        System.out.println(reverse("karan"));
    }

     static  String  reverse(String  txt ){
        return  helper(txt ,0 );

     }

    static String helper(String s, int idx) {
        if (idx >= s.length()) return "";
        return helper(s, idx + 1) + s.charAt(idx);
    }


}

