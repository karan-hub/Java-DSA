# Recursive Palindrome Checker in Java

---

## ✨ Method Overview

```java
static boolean is_palindrome(String str , int start , int end){
    if (start >= end) return true;

    char l = str.charAt(start), r = str.charAt(end);

    if (!Character.isLetterOrDigit(l))  
        return is_palindrome(str, start + 1, end);
    else if (!Character.isLetterOrDigit(r)) 
        return is_palindrome(str, start, end - 1);
    else if (Character.toLowerCase(r) == Character.toLowerCase(l)) 
        return is_palindrome(str, start + 1, end - 1);
    else  
        return false;
}
```

This function ignores non-alphanumeric characters and checks for palindromes **case-insensitively** using recursion.

---

## 📚 Input Example: `"A man, a plan, a canal: Panama"`

```java
String s = "A man, a plan, a canal: Panama";
System.out.println(is_palindrome(s, 0, s.length() - 1));
```

### ✅ Output: `true`

---

## 🌳 Recursive Tree (Simplified View for Input)

```
is_palindrome(0, 29)  → 'A' vs 'a' ✅
└── is_palindrome(1, 28) → ' ' not alphanumeric ❌ skip
    └── is_palindrome(2, 28) → 'm' vs 'm' ✅
        └── is_palindrome(3, 27) → 'a' vs 'a' ✅
            └── is_palindrome(4, 26) → 'n' vs 'n' ✅
                └── is_palindrome(5, 25) → ',' ❌ skip
                    └── is_palindrome(6, 25) → ' ' ❌ skip
                        └── is_palindrome(7, 25) → 'a' vs 'a' ✅
                            └── is_palindrome(8, 24) → ' ' ❌ skip
                                └── is_palindrome(9, 24) → 'p' vs 'p' ✅
                                    └── is_palindrome(10, 23) → 'l' vs 'l' ✅
                                        └── is_palindrome(11, 22) → 'a' vs 'a' ✅
                                            └── is_palindrome(12, 21) → 'n' vs 'n' ✅
                                                └── is_palindrome(13, 20) → ':' ❌ skip
                                                    └── is_palindrome(13, 19) → ' ' ❌ skip
                                                        └── is_palindrome(13, 18) → 'a' vs 'a' ✅
                                                            └── is_palindrome(14, 17) → ' ' ❌ skip
                                                                └── is_palindrome(15, 17) → 'c' vs 'c' ✅
                                                                    └── is_palindrome(16, 16) → base case ✅                    
                                                                         └──  is_palindrome (start >= end) ✅ Base Case → true
```

---

## 🧠 Stack Visualization for the Same Input

```
Bottom of Stack
|
| main()  <-- starting point
| is_palindrome(str, 0, 29)
| is_palindrome(str, 1, 29)   <-- skip ' '
| is_palindrome(str, 2, 29)
| is_palindrome(str, 2, 28)
| is_palindrome(str, 3, 27)
| is_palindrome(str, 4, 26)
| is_palindrome(str, 5, 25)
| is_palindrome(str, 6, 24)
| is_palindrome(str, 7, 24)   <-- skip ','
| is_palindrome(str, 8, 24)   <-- skip ' '
| is_palindrome(str, 9, 24)
| is_palindrome(str, 10, 23)  <-- skip ' '
| is_palindrome(str, 11, 22)
| is_palindrome(str, 12, 21)
| is_palindrome(str, 13, 20)
| is_palindrome(str, 14, 19)
| is_palindrome(str, 15, 18)
| is_palindrome(str, 16, 17)
| is_palindrome(str, 17, 17)  <-- Base condition (start >= end)
|
Top of Stack
```
 
---

## ⚡ How It Works:

1. **Skip** non-alphanumeric characters from both ends.
2. **Compare** lowercase characters.
3. If all pairs match until the center, it's a **palindrome**.

---

## ✨ Highlights:
- Ignores punctuations and spaces
- Case insensitive
- Recursively checks from outside in
- Clean and readable

---
