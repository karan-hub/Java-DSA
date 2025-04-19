package StringsBasicMedium;

import javax.swing.plaf.IconUIResource;

public class makePalindrome {
    public static void main(String[] args) {
        String  s= "abad";
//        System.out.println(isPalindrome(s, 0 , s.length()-1));
        System.out.println(minInsert(s));

    }
    static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static int minInsert(String s) {
        int count = 0;
        int end = s.length() - 1;

        while (end >= 0) {
            if (isPalindrome(s, 0, end)) {
                break;
            }
            count++;
            end--;
        }

        return count;
    }

    public static int minChar(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.startsWith(rev.substring(i))) {
                return i;
            }
        }

        return n - 1;
    }




}


