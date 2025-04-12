package RecursionBasic;

public class Palindrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(is_palindrome(s, 0, s.length() - 1));
    }

    static boolean is_palindrome(String str , int start , int end){
        if (start>=end) return  true;

        char  l = str.charAt(start) ,r= str.charAt(end);
        if (!Character.isLetterOrDigit(l))  return  is_palindrome(str ,start+1 , end);
        else if (!Character.isLetterOrDigit(r)) return is_palindrome(str , start , end-1);
        else if(Character.toLowerCase(r)  == Character.toLowerCase(l)) return is_palindrome(str , start+1 ,end-1);
        else  return false;
    }

}
