 
# 🔄 Anagram Checker in Java - Easy Explanation 

---

## ✅ What is an Anagram?

Two strings are **anagrams** if:
- They have the **same characters**
- Each character appears the **same number of times**
- Order doesn't matter

📌 **Example:**
- `"listen"` and `"silent"` → ✅ anagrams
- `"hello"` and `"world"` → ❌ not anagrams

---

## 🚀 Goal

Write a Java program to check whether two strings are anagrams or not.

---

## 💡 Program Flow (Step-by-Step)

1. **Check Lengths**
   - If the lengths of both strings are **not the same**, return `false`.

2. **Create Frequency Map for First String**
   - Count how many times each character appears in string `s`.
   - Store this in a **HashMap**.

3. **Compare with Second String**
   - Go through each character of string `t`.
   - For each character:
     - If it's **not in the map** → not an anagram → return `false`.
     - If it **is in the map** → decrease its count.
     - If the count becomes `0` → remove that character from the map.

4. **Final Check**
   - If the map is **empty** at the end, it's an anagram!

---

## 🧠 Code with Explanation

```java
import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Check if lengths are equal
        if (s.length() != t.length()) return false;

        // Step 2: Create frequency map for string s
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 3: Match characters from string t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c); // Remove when count becomes 0
            }
        }

        // Step 4: If map is empty, strings are anagrams
        return map.isEmpty();
    }
}
```

---

## 🔍 Example Walkthrough

Let's test with:
```java
s = "anagram"
t = "nagaram"
```

### Step-by-step:
- Count for `s`: `{a:3, n:1, g:1, r:1, m:1}`
- Reduce using `t`: each character reduces the count
- All counts go to 0 → map becomes empty → ✅ It's an anagram

---

## 🧪 Sample Test Code

```java
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isAnagram("listen", "silent")); // true
        System.out.println(sol.isAnagram("rat", "car"));       // false
        System.out.println(sol.isAnagram("aabb", "baba"));     // true
    }
}
```

---

## ⏱ Time and Space Complexity

| Metric            | Value       |
|------------------|-------------|
| ⏰ Time Complexity | O(n)        |
| 🧠 Space Complexity| O(1) (at most 26 letters for lowercase English) |

---

## 📌 Summary

✅ If you want to check if two strings are anagrams:
- Use a HashMap to count frequencies
- Compare both strings smartly
- Clean and efficient code using simple logic

This solution works fast and uses minimum memory 🚀

---
 