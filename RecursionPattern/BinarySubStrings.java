package RecursionPattern;

public class BinarySubStrings {
    public static void main(String[] args) {
//        getAllSubString(4 ,"");
        String s = "0110";
        int n = 4;

        System.out.println(queryString(s,n));


    }

    static void getAllSubString(int length, String str) {
        if (str.length() == length) {
            System.out.println(str);
            return;
        }

        getAllSubString(length, str + "0");
        getAllSubString(length, str + "1");

    }

    public static boolean queryString(String s, int n) {
        return checkBinarySubstrings(s, 1, n);
    }

    private static boolean checkBinarySubstrings(String s, int current, int n) {
         if (current > n)  return true;
        String binary = Integer.toBinaryString(current);
        if (!s.contains(binary))  return false;
        return checkBinarySubstrings(s, current + 1, n);
    }



}
