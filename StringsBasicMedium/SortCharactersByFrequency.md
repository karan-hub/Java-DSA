 

# 🔡 Frequency Sort in Java  
---

## 🧠 Problem Statement
 


**Given a string `s`, sort it in decreasing order based on the frequency of characters.**

📌 **Example:**
```
Input: "tree"
Output: "eetr" or "eert"
```
> `e` appears twice, while `t` and `r` appear once.

---

## 🚀   Solution

```java
class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character>[] arr = new ArrayList[s.length() + 1];
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : s.toCharArray()) 
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        map.keySet().forEach(c -> {
            if (arr[map.get(c)] == null) 
                arr[map.get(c)] = new ArrayList<>();
            arr[map.get(c)].add(c);
        });

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != null) {
                for (Character ch : arr[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();
    }
}
```

---

## 🔍 Line-by-Line Explanation

### 🏗️ Step 1: Setup

```java
StringBuilder sb = new StringBuilder();
```
- Used to **efficiently build the output string**. It avoids creating multiple string objects.

```java
List<Character>[] arr = new ArrayList[s.length() + 1];
```
- We create a **bucket array**, where the index represents the **frequency**.
- `arr[i]` will store a list of characters that appear **i times** in the string.

```java
Map<Character, Integer> map = new HashMap<>();
```
- Stores the **frequency** of each character in the string.

---

### 📊 Step 2: Count Frequencies

```java
for (Character ch : s.toCharArray())
    map.put(ch, map.getOrDefault(ch, 0) + 1);
```
- Convert string to a character array.
- Use `getOrDefault()` to update the frequency of each character.

> ✨ Example:  
For input `s = "cccaaa"`, the map becomes:  
`{'c' → 3, 'a' → 3}`

---

### 📦 Step 3: Group Characters by Frequency

```java
map.keySet().forEach(c -> {
    if (arr[map.get(c)] == null)
        arr[map.get(c)] = new ArrayList<>();
    arr[map.get(c)].add(c);
});
```

- Traverse the `map`'s keys.
- Use character frequency as index and group them into buckets.

> ✨ Example:  
`arr[3] = ['c', 'a']` (both `c` and `a` appeared 3 times)

---

### ⬇️ Step 4: Build Output From Highest Frequency

```java
for (int i = arr.length - 1; i > 0; i--) {
    if (arr[i] != null) {
        for (Character ch : arr[i]) {
            for (int j = 0; j < i; j++) {
                sb.append(ch);
            }
        }
    }
}
```

- Start from the **highest frequency bucket**.
- Append each character `i` times to the `StringBuilder`.

> ✨ Example:  
For `arr[3] = ['c', 'a']`, it adds `ccc` and `aaa`.

---

### ✅ Step 5: Return Result

```java
return sb.toString();
```

- Converts the `StringBuilder` into the final string.

---

## 🧪 Example Walkthrough

For input: `"bbbaaacc"`

- Frequency Map: `{b=3, a=3, c=2}`
- Buckets:  
  `arr[3] = [b, a]`  
  `arr[2] = [c]`
- Output: `"bbbaaacc"` or `"aaabbbcc"` (both valid)

---

## ⏱️ Time and Space Complexity

| Metric | Value |
|--------|-------|
| 🕒 Time Complexity | **O(n)** — One pass for frequency counting, one for bucket filling, and one for result generation. |
| 💾 Space Complexity | **O(n)** — For frequency map and bucket array. |

---

## 🧠 Intuition Analogy

Imagine you’re organizing books (characters) into shelves (frequency buckets). The thicker the book (more frequent), the higher up it goes. At the end, you arrange books starting from the top shelf (most frequent) down to the lowest.

---

## 🎯 Why Is This Efficient?

✅ Avoids sorting characters individually — uses **bucket sort** instead.  
✅ Leverages **StringBuilder** for optimized string concatenation.  
 

---
 