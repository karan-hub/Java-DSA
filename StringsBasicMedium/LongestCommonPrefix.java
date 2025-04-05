package StringsBasicMedium;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

         
         
        String[] strs7 = { "flower", "flow", "flight" };
        String result7 = lcp.longestCommonPrefix2(strs7);
        System.out.println("Longest Common Prefix for strs7: " + result7);
 
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String smallStr = strs[0];

        for (String string : strs) {
            if (string.length() < smallStr.length()) {
                smallStr = string;
            }
        }

        for (int j = 0; j < smallStr.length(); j++) {
            for (String string : strs) {
                char ch = smallStr.charAt(j);
                if (ch != string.charAt(j)) {
                    return smallStr.substring(0, j);

                }
            }

        }

        return smallStr;

    }

    public String longestCommonPrefix2(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0)
                    return " ";
            }
        }

        return prefix;
    }
}
