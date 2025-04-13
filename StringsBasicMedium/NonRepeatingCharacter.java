package StringsBasicMedium;

public class NonRepeatingCharacter {
    public static void main(String[] args) {

    }
    public  static  char firstNonRepeatingChar(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }

        return '\0'; // or any default char if no non-repeating character
    }

}
