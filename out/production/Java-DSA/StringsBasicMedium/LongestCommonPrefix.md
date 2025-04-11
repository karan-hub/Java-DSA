
# Longest Common Prefix

---

## 🚀 Code Implementation

### Approach 1: Character-by-Character Comparison

```java
package StringsBasicMedium;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String[] strs7 = { "flower", "flow", "flight" };
        String result7 = lcp.longestCommonPrefix(strs7);
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
}
```

---

### Approach 2: Iterative Prefix Refinement

```java
package StringsBasicMedium;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String[] strs7 = { "flower", "flow", "flight" };
        String result7 = lcp.longestCommonPrefix2(strs7);
        System.out.println("Longest Common Prefix for strs7: " + result7);
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
```

---

## 📝 Explanation with Visuals

### Approach 1: Character-by-Character Comparison

1. **Find the smallest string**:
   - Identify the shortest string in the array to limit comparisons.
   - Example:
     ```
     Input: ["flower", "flow", "flight"]
     Smallest String: "flow"
     ```

2. **Character-by-character comparison**:
   - Compare each character of the smallest string with the corresponding character of other strings.
   - Stop when a mismatch is found.

   **Visual**:
   ```
   flower: f l o w e r
   flow:    f l o w
   flight:  f l i g h t
   Result:  f l
   ```

3. **Return prefix**:
   - Return the substring up to the point of mismatch.

---

### Approach 2: Iterative Prefix Refinement

1. **Start with the first string**:
   - Assume the first string is the prefix.
   - Example:
     ```
     Input: ["flower", "flow", "flight"]
     Initial Prefix: "flower"
     ```

2. **Iteratively refine the prefix**:
   - Compare the prefix with each string.
   - Shorten the prefix until it matches the start of the string.

   **Visual**:
   ```
   flower: f l o w e r
   flow:    f l o w
   Prefix after comparison: "flow"

   flight:  f l i g h t
   Prefix after comparison: "fl"
   ```

3. **Return prefix**:
   - Return the refined prefix.

---

## 🌟 Example

Input:
```java
String[] strs7 = { "flower", "flow", "flight" };
```

Output:
```
Longest Common Prefix for strs7: fl
```

---

## 📊 Complexity Analysis

| Approach                | Time Complexity | Space Complexity |
|-------------------------|-----------------|------------------|
| Character-by-Character  | O(S)            | O(1)             |
| Iterative Refinement    | O(S)            | O(1)             |

Where `S` is the total number of characters in all strings combined.

---

## 💡 Usage

This implementation is useful in scenarios like:
- **Autocomplete systems**.
- **String matching algorithms**.
- **Finding common patterns in datasets**.

---

## 🎯 Key Takeaways

- **Character-by-Character Comparison** is more intuitive but may involve redundant comparisons.
- **Iterative Prefix Refinement** is optimized by iteratively refining the prefix.
- Both approaches have the same time and space complexity, making them efficient for practical use cases.

