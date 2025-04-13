
# 🧠 First Non-Repeating Character (Java)
 

---

This Java program helps you **find the first non-repeating character** in a string. The algorithm uses frequency counting to efficiently identify the first unique character.

---

## 🔄 Program Flow

1. **Input Validation**:  
   The program checks if the input string is valid and non-empty. If the string is empty, it immediately returns a default value (`'\0'`).
   

2. **Character Frequency Count**:  
   It traverses the string once and counts the frequency of each character using an integer array (`int[26]`), where each index corresponds to a letter in the alphabet (`'a'` to `'z'`).


3. **Find First Unique Character**:  
   It then iterates over the string again to find the first character whose frequency is **1**. This is the first non-repeating character.


4. **Return the Result**:  
   If such a character is found, it is returned. If no such character exists, it returns a default value (`'\0'`).

---

## ✅ Problem Statement

Given a string `s`, return the **first character** that does **not repeat**.  
If there is no such character, return a default character (`'\0'` or anything you prefer).

---

### 📚 Examples

| **Input**              | **Output**        | **Explanation**                                                                                                                                 |
|------------------------|-------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| `"leetcode"`           | `'l'`             | `'l'` is the first non-repeating character.                                                                                                     |
| `"loveleetcode"`       | `'v'`             | `'v'` is the first character that does not repeat after the first occurrence.                                                                  |
| `"aabbcc"`             | `'\0'`            | No character is non-repeating. Therefore, return the default value `'\0'`.                                                                    |
| `"abaccd"`             | `'b'`             | `'b'` is the first character that appears only once in the string.                                                                             |
| `"zzxx"`               | `'\0'`            | No non-repeating characters.                                                                                                                   |

---

## 🚀 Approach

1. **Step 1:**  
   **Trim Leading Whitespace**:  
   First, we check if there are any unnecessary leading spaces and remove them using `trim()` if needed.

2. **Step 2:**  
   **Frequency Count**:  
   Traverse through the string and store the frequency of each character in an integer array `freq[26]`. This array maps `'a'` to `'z'` to indexes `0` to `25`.

3. **Step 3:**  
   **Search for the First Non-Repeating Character**:  
   Iterate over the string again. For each character, check if its frequency is exactly `1`. If found, return that character.

4. **Step 4:**  
   **Return Default Character**:  
   If no unique character is found, return `'\0'` (or any other placeholder value).

---

### 💡 Java Code Implementation

```java
public class Solution {
    public char firstNonRepeatingChar(String s) {
        int[] freq = new int[26]; // Frequency array for lowercase letters

        // Step 1: Count character frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Find the first non-repeating character
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }

        // Step 3: Return '\0' if no non-repeating character is found
        return '\0'; 
    }
}
```

---

## 🧾 Time & Space Complexity

- **Time Complexity:** O(n)  
  Where `n` is the length of the string. We traverse the string twice: once for counting frequencies and once for finding the first unique character.

- **Space Complexity:** O(1)  
  The space used for frequency counting is constant (`int[26]` for the lowercase English alphabet).

---

## 🎯 Test Cases

1. **Test Case 1:**
    - **Input:** `"leetcode"`
    - **Expected Output:** `'l'`
    - **Explanation:** `'l'` is the first non-repeating character.

2. **Test Case 2:**
    - **Input:** `"loveleetcode"`
    - **Expected Output:** `'v'`
    - **Explanation:** `'v'` is the first non-repeating character after the first occurrence of `'l'`.

3. **Test Case 3:**
    - **Input:** `"aabbcc"`
    - **Expected Output:** `'\0'`
    - **Explanation:** All characters are repeating, so return `'\0'`.

4. **Test Case 4:**
    - **Input:** `"abaccd"`
    - **Expected Output:** `'b'`
    - **Explanation:** `'b'` is the first non-repeating character.

5. **Test Case 5:**
    - **Input:** `"zzxx"`
    - **Expected Output:** `'\0'`
    - **Explanation:** No non-repeating characters, so return `'\0'`.

---

## 📈 How It Works:

### **Step-by-Step Walkthrough**:

1. **Count Frequencies**:  
   When the input is `"leetcode"`, the frequency map looks like:
   ```plaintext
   l: 1
   e: 2
   t: 1
   o: 1
   c: 1
   d: 1
   ```

2. **Find First Unique**:  
   We then iterate again, checking each character. As soon as we find `'l'` with a frequency of `1`, we return `'l'`.

---
 