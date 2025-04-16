package StringsBasicMedium;

public class RemoveTrailingZero {
    public static void main(String[] args) {

        System.out.println( removeTrailingZeros("51230100"));

    }
    public static String     removeTrailingZeros(String num) {
        int len = num.length()-1;
        while (num.charAt(len) == '0') len--;
        return num.substring(0, len + 1);
    }
}
