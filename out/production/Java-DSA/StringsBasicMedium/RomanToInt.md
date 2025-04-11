 
# 🏛️ Roman to Integer Conversion 🚀
---
 

This program converts a Roman numeral string (like `"IX"`, `"MCMXCIV"`) into its equivalent **integer** value using Java's **Enhanced Switch** and a smart parsing approach.

---

## 🧠 What Are Roman Numerals?

| Roman | Value |
|-------|-------|
| I     | 1     |
| V     | 5     |
| X     | 10    |
| L     | 50    |
| C     | 100   |
| D     | 500   |
| M     | 1000  |

✅ Normally, we **add** values.  
❗ But if a **smaller value comes before a bigger one**, we **subtract** it.

Example:
- `IV = 5 - 1 = 4`
- `MCM = 1000 + (1000 - 100) = 1900`

---

## 🧩 Code Overview

```java
public class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int ans = 0;

        for (int i = 0; i < len; i++) {
            if ((i+1) < len && getValue(s.charAt(i)) < getValue(s.charAt(i + 1)))
                ans = ans - getValue(s.charAt(i));  // subtract if smaller before bigger
            else
                ans = ans + getValue(s.charAt(i));  // else, just add
        }

        return ans;
    }

    public int getValue(char ch) {
        int result = switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;  // handles any invalid char
        };
        return result;
    }
}
```

---

## 🔍 Flow Explained Visually

Imagine `s = "MCMXCIV"`  
We walk **left to right** comparing current & next character:

```
M  C  M  X  C  I  V
|  |  |  |  |  |  |
1000 100 1000 10 100 1 5

Step-by-step:
- M (1000) → next is C (100):1000 > 100 → ADD → ans = 1000
- C (100) → next is M (1000): 100 < 1000 → SUB → ans = 1000 - 100 = 900
- M (1000) → next is X (10): 1000 > 10 → ADD → ans = 900 + 1000 = 1900
- X (10) → next is C (100): 10 < 100 → SUB → ans = 1900 - 10 = 1890
- C (100) → next is I (1): 100 > 1 → ADD → ans = 1890 + 100 = 1990
- I (1) → next is V (5): 1 < 5 → SUB → ans = 1990 - 1 = 1989
- V (5) → no next → ADD → ans = 1989 + 5 = ✅1994
```

---

## 🛠️ Why `i+1 < len` is important?

To avoid this crash:

```java
s.charAt(i + 1)  // ❌ will crash if i is the last index
```

So we first check:
```java
if (i + 1 < len && ...)  // ✅ safe to access next char
```

---

## 🔄 Enhanced Switch? What’s That?

Java's **enhanced switch** makes code cleaner and faster.  

Instead of:
```java
switch (ch) {
    case 'I': return 1;
    ...
}
```

We write:
```java
int result = switch (ch) {
    case 'I' -> 1;
    ...
};
```

✅ Looks neat  
✅ Less error-prone  
✅ Modern Java (14+)

---

## ⏱️ Time & Space Complexity

| Type | Value |
|------|-------|
| ⏰ Time | O(n) — we traverse each character once |
| 🧠 Space | O(1) — no extra space except variables |

---

## 🧪 Sample Test Cases

```java
Input:  "III"      → Output: 3  
Input:  "IX"       → Output: 9  
Input:  "LVIII"    → Output: 58  
Input:  "MCMXCIV"  → Output: 1994  
```

---
 