 
# 🔁 Isomorphic Strings  

---

## 🧠 What are Isomorphic Strings?

Two strings **s** and **t** are **isomorphic** if:

1. Each character from `s` can be replaced with a character from `t`
2. Each character maps to only **one** character (one-to-one)
3. The order of characters stays the same
4. Reverse mapping is also unique

---

## ✅ Examples

| String `s` | String `t` | Isomorphic? | Why? |
|------------|------------|-------------|------|
| `"egg"`    | `"add"`    | ✅ Yes       | `e → a`, `g → d` |
| `"foo"`    | `"bar"`    | ❌ No        | `o → a` and `o → r` ❌ |
| `"paper"`  | `"title"`  | ✅ Yes       | All mappings are consistent |
| `"ab"`     | `"aa"`     | ❌ No        | `a → a`, `b → a` ❌ (many-to-one) |
| `"aba"`    | `"xyx"`    | ✅ Yes       | `a → x`, `b → y` |

---

## 🧪 Test Cases

```java
System.out.println(obj.isIsomorphic("foo", "bar"));     // false
System.out.println(obj.isIsomorphic("paper", "title")); // true
System.out.println(obj.isIsomorphic("egg", "add"));     // true
System.out.println(obj.isIsomorphic("abc", "def"));     // true
System.out.println(obj.isIsomorphic("ab", "aa"));       // false
System.out.println(obj.isIsomorphic("aab", "xyz"));     // false
System.out.println(obj.isIsomorphic("aba", "xyx"));     // true
```

---

## 👨‍💻 Code Without Using Map

```java
public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) return false;

    ArrayList<ArrayList<Character>> list = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
        char value = s.charAt(i); // from s
        char key = t.charAt(i);   // from t

        ArrayList<Character> pair = new ArrayList<>();
        pair.add(key);
        pair.add(value);

        if (!list.contains(pair)) {
            for (ArrayList<Character> test : list) {
                if (pair.get(0) == test.get(0) && pair.get(1) != test.get(1)) return false;
                if (pair.get(1) == test.get(1) && pair.get(0) != test.get(0)) return false;
            }
            list.add(pair);
        }
    }

    return true;
}
```
---



### ✅ Step-by-step explanation:

   
Example  :
```java
s = "egg"
t = "add"
```
 

## 🔍 Method:

```java
public boolean isIsomorphic(String s, String t)
```

---


---

### 🟩 Step 1: Length Check

```java
if (s.length() != t.length()) return false;
```

- Agar dono strings ki length alag hai, to obviously mapping possible hi nahi.
- Example: `"abc"` and `"de"` → ❌ different length → return false.

---

### 🟩 Step 2: Create an empty list to store character pairs

```java
ArrayList<ArrayList<Character>> list = new ArrayList<>();
```

- Ye list tumhare har character pair (`t.charAt(i)` → `s.charAt(i)`) ko store karega.

🔸Example ke liye:
- `s = "egg"`
- `t = "add"`

---

### 🟩 Step 3: Loop through characters

```java
for (int i = 0; i < s.length(); i++) {
```

---

### 🟩 Step 4: Take each character from `s` and `t`

```java
char value = s.charAt(i); // 'e', 'g', 'g'
char key = t.charAt(i);   // 'a', 'd', 'd'
```

---

### 🟩 Step 5: Create pair [key, value]

```java
ArrayList<Character> pair = new ArrayList<>();
pair.add(key);   // from t
pair.add(value); // from s
```

- Hum key = `t.charAt(i)` aur value = `s.charAt(i)` le rahe hain.
- Iska reason: hum `key → value` mapping check kar rahe hain.

📌 **Pair structure**: `[key, value]` = `[t.charAt(i), s.charAt(i)]`

---

### 🟩 Step 6: Check if this pair already exists

```java
if (!list.contains(pair)) {
```

- Agar pair nahi mila list mein, tabhi aage check karenge.
- Agar mil gaya, to koi dikkat nahi, skip.

---

### 🟩 Step 7: Check for **conflicting mappings**

```java
for (ArrayList<Character> test : list) {
    if (pair.get(0) == test.get(0) && pair.get(1) != test.get(1)) return false;
    if (pair.get(1) == test.get(1) && pair.get(0) != test.get(0)) return false;
}
```

#### ✅ What these 2 conditions mean:

---

1️⃣ **Condition 1:**

```java
if (pair.get(0) == test.get(0) && pair.get(1) != test.get(1))
```

🧠 *Same character from `t`, mapping to different character from `s`*

📌 Example: `"ab"` → `"aa"`

- `a → a` ✅
- `b → a` ❌ same `t.charAt(i)` (`a`) mapped to multiple `s.charAt(i)` (`a` and `b`)

---

2️⃣ **Condition 2:**

```java
if (pair.get(1) == test.get(1) && pair.get(0) != test.get(0))
```

🧠 *Same character from `s`, mapping to different character from `t`*

📌 Example: `"foo"` → `"bar"`

- `o → a`, then `o → r` ❌

---

### 🟩 Step 8: If all checks passed, add pair to list

```java
list.add(pair);
```

---

### ✅ Final Return

```java
return true;
```

- Agar saare pairs ekdum sahi map hue bina conflict ke, then return true.

---

## 🔁 Example Execution: `"egg"` → `"add"`

| i | s[i] | t[i] | Pair    | Action                                |
|---|------|------|---------|----------------------------------------|
| 0 | 'e'  | 'a'  | [a, e]  | ✅ Add to list                         |
| 1 | 'g'  | 'd'  | [d, g]  | ✅ Add to list                         |
| 2 | 'g'  | 'd'  | [d, g]  | 🔁 Already exists → skip               |
|   |      |      |         | No conflicts → ✅ Final return `true` |

---

## 🔢 Time & Space Complexity

### ⏱ Time Complexity:  
**O(RecursionBasic²)**

- Outer loop → `O(RecursionBasic)`
- Inner loop (`list.contains`, `for-each`) → Worst case `O(RecursionBasic)`
- Total: `O(RecursionBasic²)`

✅ Better approach: use `HashMap` to bring this to `O(RecursionBasic)`

---

### 🧠 Space Complexity:  
**O(RecursionBasic)**

- At most, `RecursionBasic` unique pairs stored in list.

---

Agar tum chaaho to ab main Map based optimized version bhi de sakta hoon with same style. Bolo bas 💡

### 🔸 With Map (Efficient Method):

```java
Map<Character, Character> mapST = new HashMap<>();
Map<Character, Character> mapTS = new HashMap<>();
```

| Metric            | Complexity | Explanation |
|-------------------|------------|-------------|
| **Time**          | O(RecursionBasic)       | One pass through both strings with O(1) map access |
| **Space**         | O(RecursionBasic)       | Two maps storing at most `RecursionBasic` entries |

💡 Example:
- `"egg"` → `"add"`:
  - `e → a` → stored in map
  - `g → d` → stored in map
  - Re-check `g → d` → O(1)

---

## 🧠 Real-Life Analogy

| Concept        | Real Example |
|----------------|--------------|
| One-to-one map | Roll No ↔ Student |
| Invalid Map    | Two students with same roll no (❌) |
| isomorphic     | Consistent roll assignment (✅) |

---

## 🚀 Alternate (Map-based) Code

```java
public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) return false;

    Map<Character, Character> mapST = new HashMap<>();
    Map<Character, Character> mapTS = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char chS = s.charAt(i);
        char chT = t.charAt(i);

        if (mapST.containsKey(chS)) {
            if (mapST.get(chS) != chT) return false;
        } else {
            mapST.put(chS, chT);
        }

        if (mapTS.containsKey(chT)) {
            if (mapTS.get(chT) != chS) return false;
        } else {
            mapTS.put(chT, chS);
        }
    }

    return true;
}
```
 

---

## 🔄 Problem: Isomorphic Strings using `HashMap`

### 💡 Goal:
Check if there's a **one-to-one mapping** between characters of `s` and `t`.

---

## ✅ Example:

```java
s = "paper"
t = "title"
```

| i | s[i] | t[i] | Mapping(s → t) | Mapping(t → s) |
|---|------|------|----------------|----------------|
| 0 | 'p'  | 't'  | p → t          | t → p          |
| 1 | 'a'  | 'i'  | a → i          | i → a          |
| 2 | 'p'  | 't'  | ✅ same as before | ✅ same         |
| 3 | 'e'  | 'l'  | e → l          | l → e          |
| 4 | 'r'  | 'e'  | r → e          | e → r          |

✅ All consistent → return `true`

---

## 📦 Code Explanation (Step-by-Step)

```java
if (s.length() != t.length()) return false;
```

🧠 If lengths differ → can't be isomorphic.

---

### ✅ Create 2 HashMaps

```java
Map<Character, Character> mapST = new HashMap<>();
Map<Character, Character> mapTS = new HashMap<>();
```

- `mapST`: Mapping from `s → t`
- `mapTS`: Mapping from `t → s`
- Why 2 maps? To make sure mapping is **bijective** (both one-to-one and onto)

---

### 🔁 Loop over characters

```java
for (int i = 0; i < s.length(); i++) {
    char chS = s.charAt(i);
    char chT = t.charAt(i);
```

---

### 🧠 Check forward mapping (`s → t`)

```java
if (mapST.containsKey(chS)) {
    if (mapST.get(chS) != chT) return false;
} else {
    mapST.put(chS, chT);
}
```

📌 *If chS is already mapped to a different chT → ❌ Not isomorphic*

---

### 🧠 Check reverse mapping (`t → s`)

```java
if (mapTS.containsKey(chT)) {
    if (mapTS.get(chT) != chS) return false;
} else {
    mapTS.put(chT, chS);
}
```

📌 *Same for reverse: if chT already maps to a different chS → ❌*

---

### ✅ Finally

```java
return true;
```

If no conflicting mappings found → return `true`

---

## ⏱ Time & Space Complexity

| Complexity     | Explanation                        |
|----------------|------------------------------------|
| **Time: O(RecursionBasic)** | Loop through all characters once   |
| **Space: O(RecursionBasic)**| At most 2 maps with `RecursionBasic` entries    |

✅ Much better than the previous `O(RecursionBasic²)` list-based approach.

---

## 🔥 Why This is Better:

- `HashMap` lookup and insertion → O(1) average time.
- Two-way mapping ensures no duplicates from either side.
- Clean, readable, and efficient.

---

### ✅ Summary Table:

| Feature              | List Approach     | Map Approach         |
|----------------------|------------------|-----------------------|
| Time Complexity      | O(RecursionBasic²)            | ✅ O(RecursionBasic)               |
| Space Complexity     | O(RecursionBasic)             | ✅ O(RecursionBasic)               |
| Readability          | Medium           | ✅ High               |
| Use Case             | Learning logic   | ✅ Real-world usage   |

---

 

## 📚 Summary Table

| Approach     | Time Complexity | Space Complexity | Suitable For |
|--------------|------------------|------------------|----------------|
| ArrayList    | O(RecursionBasic²)            | O(RecursionBasic)             | Simple logic, no maps |
| Map-based    | O(RecursionBasic)             | O(RecursionBasic)             | Optimal, scalable |

---
 