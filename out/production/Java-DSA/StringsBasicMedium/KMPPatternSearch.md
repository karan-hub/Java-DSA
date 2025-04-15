# KMP (Knuth-Morris-Pratt) Pattern Searching Algorithm 🔎

KMP algorithm is an efficient way to search for occurrences of a "pattern" string within a "text" string in **O(n + m)** time, where:
- `n` is the length of the text
- `m` is the length of the pattern

Unlike the naive approach, KMP doesn’t backtrack the text pointer, thanks to **LPS (Longest Prefix Suffix)** array.

---

## 🔄 Core Concepts

### 1. Why KMP?
Naive search is **O(n*m)** in worst case. KMP avoids unnecessary re-checks using information from the **pattern** itself via LPS array.

### 2. What is LPS Array?
The **LPS[i]** indicates the longest proper prefix of the pattern [0..i] which is also a suffix. It helps us **reuse** previously matched characters instead of rechecking them.

#### 👁️ Visual Example for `lps[]` of "abcaby":

| Index (i) | Char | LPS[i] |
|-----------|------|--------|
| 0         | a    | 0      |
| 1         | b    | 0      |
| 2         | c    | 0      |
| 3         | a    | 1      |
| 4         | b    | 2      |
| 5         | y    | 0      |

---

## 📄 Java Implementation

```java
class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        int[] lps = KMP(pat);
        int t = 0, p = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (t < txt.length()) {
            if (txt.charAt(t) == pat.charAt(p)) {
                t++;
                p++;
            }

            if (p == pat.length()) {
                list.add(t - p + 1);  // 1-based index
                p = lps[p - 1];
            } else if (t < txt.length() && txt.charAt(t) != pat.charAt(p)) {
                if (p != 0) {
                    p = lps[p - 1];
                } else {
                    t++;
                }
            }
        }

        return list;
    }

    public int[] KMP(String pat) {
        int[] lps = new int[pat.length()];
        int len = 0;
        int j = 1;

        while (j < pat.length()) {
            if (pat.charAt(j) == pat.charAt(len)) {
                len++;
                lps[j] = len;
                j++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[j] = 0;
                    j++;
                }
            }
        }

        return lps;
    }
}
```

---

## 🌍 Real World Analogy:

> Imagine typing a password. If you make a mistake, instead of starting over, the system auto-detects the part you've typed correctly and jumps you back smartly. That's KMP.

---

## ✅ Why This Works
- Reuse pattern info = No unnecessary backtracking
- LPS = precomputed help
- Clean O(n + m) time

---
 