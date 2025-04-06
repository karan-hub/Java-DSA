package StringsBasicMedium;

import java.util.ArrayList;
 

public class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStrings obj = new IsomorphicStrings();
        System.out.println(obj.isIsomorphic("foo", "bar")); // false
        System.out.println(obj.isIsomorphic("paper", "title")); // true
        System.out.println(obj.isIsomorphic("egg", "add")); // true
        System.out.println(obj.isIsomorphic("abc", "def")); // true
        System.out.println(obj.isIsomorphic("ab", "aa")); // false
        System.out.println(obj.isIsomorphic("aab", "xyz")); // false
        System.out.println(obj.isIsomorphic("aba", "xyx")); // ✅ should be TRUE

    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            char key = t.charAt(i);

            ArrayList<Character> pair = new ArrayList<>();
            
            pair.add(key);
            pair.add(value);
            if (!list.contains(pair)) {
                for (ArrayList<Character> test :list) {
                    if (pair.get(0) == test.get(0) && pair.get(1) != test.get(1))
                        return false;
                    if (pair.get(1) == test.get(1) && pair.get(0) != test.get(0))
                        return false;

                }
            list.add(pair);

            }

        }
        // System.out.println(s + " " + t + " " + list.toString() + "\n\t");

        return true;
    }
}
