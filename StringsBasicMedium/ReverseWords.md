# Reverse Words in a String

 

### 📂 Class: `Solution`

The `Solution` class contains two key methods:
1. **`reverseWords(String s)`**: Reverses the order of words in the input string.
2. **`reverse(String s)`**: Reverses the characters in a given string.

---

## 🔄 Code Flow

### 1️⃣ **`reverseWords(String s)`**
- **Input**: A string `s` containing words separated by spaces.
- **Steps**:
    1. Reverse the entire string using the `reverse` method.
    2. Split the reversed string into words using `split(" ")`.
    3. Reverse each word individually and append it to a `StringBuilder`.
    4. Trim extra spaces and replace multiple spaces with a single space.
- **Output**: A string with the words reversed but in their original order.

### 2️⃣ **`reverse(String s)`**
- **Input**: A string `s`.
- **Steps**:
    1. Iterate through the string from the end to the beginning.
    2. Append each character to a `StringBuilder`.
- **Output**: The reversed string.

---

## 🖼️ Visual Code Flow

Here’s a step-by-step visualization of the process:

### Input String: `"Hello World"`

1. **Step 1: Reverse the Entire String**
   - Input: `"Hello World"`
   - Output: `"dlroW olleH"`

2. **Step 2: Split the Reversed String**
   - Input: `"dlroW olleH"`
   - Output: `["dlroW", "olleH"]`

3. **Step 3: Reverse Each Word**
   - Input: `["dlroW", "olleH"]`
   - Output: `["World", "Hello"]`

4. **Step 4: Join the Words**
   - Input: `["World", "Hello"]`
   - Output: `"World Hello"`

---

## 🧑‍💻 Example Code

```java
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String reverseStr = reverse(s);
        String[] splitArray = reverseStr.split(" ");

        for (String word : splitArray) {
            sb.append(reverse(word)).append(" ");
        }
        return sb.toString().trim().replaceAll("\\s+", " ");
    }

    public String reverse(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
```

---

## 🛠️ Example Usage

```java
Solution solution = new Solution();
String input = "Hello World";
String result = solution.reverseWords(input);
System.out.println(result); // Output: "World Hello"
```

---

## 📌 Key Points
- The `reverse` method is used twice: once for the entire string and once for each word.
- The `split(" ")` method breaks the string into words.

Of course! Let's break down this line:

```java
return sb.toString().trim().replaceAll("\\s+", " ");
```

It’s used to **clean up spaces** in the final string. Here's how each part works:

---

### 🔍 Breakdown

#### 1. `sb.toString()`
Converts the `StringBuilder` to a regular `String`.

#### 2. `.trim()`
Removes any **leading or trailing** white spaces.

#### 3. `.replaceAll("\\s+", " ")`
Replaces **all sequences of whitespace characters** (like multiple spaces, tabs, etc.) with **a single space**.

- `\\s` → any whitespace character
- `+` → one or more occurrences

---

### ✅ Example

Let's say your `StringBuilder` contains:

```java
"  Hello     world   from   Java  "
```

---

#### Step 1: `sb.toString()`

Still gives:
```
"  Hello     world   from   Java  "
```

---

#### Step 2: `.trim()`

Removes leading/trailing spaces:
```
"Hello     world   from   Java"
```

---

#### Step 3: `.replaceAll("\\s+", " ")`

Replaces all **multiple spaces** with a **single space**:
```
"Hello world from Java"
```

---

### 🎯 Final Output:

```java
"Hello world from Java"
```

Clean and nicely spaced!


---

## 📊 Complexity Analysis
- **Time Complexity**: O(n), where `n` is the length of the input string.
- **Space Complexity**: O(n), for the `StringBuilder` and split array.

---
 