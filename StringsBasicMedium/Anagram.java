package StringsBasicMedium;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        Anagram  an = new Anagram();
        System.out.println(an.isAnagram("anagram", "nagaram")); // true
        System.out.println(an.isAnagram("rat", "car")); // false
        System.out.println(an.isAnagram("listen", "silent")); // true
    }
    public   boolean isAnagram(String s, String t) {
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) return false;

        // Create a frequency map for both strings
        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in the first string
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Decrease count based on the second string
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false; // if character is not in map, they're not anagrams
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c); // Remove from map when the count reaches 0
            }
        }

        // If map is empty, all counts matched
        return map.isEmpty();
    }
}
