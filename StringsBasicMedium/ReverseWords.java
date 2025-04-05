package StringsBasicMedium;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String input = "Hello World";
        String result = reverseWords.reverseWords(input);
        System.out.println("Reversed Words: " + result);
    }

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        // Step 1: Reverse the whole string
        String reversedString = reverse(s);
        System.out.println("Reversed String: " + reversedString);

        // Step 2: Split the reversed string
        String[] splitString = reversedString.split(" ");
        System.out.println("Split String: " + Arrays.toString(splitString));

        // Step 3: Reverse each word
        for (String word : splitString) {
            ans.append(reverse(word)).append(" ");
        }

        return ans.toString().trim(); // Trim to remove trailing space
    }

    public String reverse(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }


    public   String reverseWordsStatic(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
