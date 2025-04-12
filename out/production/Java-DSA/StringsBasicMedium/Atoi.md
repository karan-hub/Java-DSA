 
# 🚀 **String to Integer (atoi)** Algorithm in Java

The **`myAtoi`** function is an implementation of the `atoi` function — a popular string-to-integer conversion function. It converts a string representing a number into an integer, while handling various edge cases like spaces, signs, and overflow. This is commonly asked in coding interviews and is a great exercise for understanding how to handle strings and numbers in Java.

---

## 🌟 **Key Points of the Implementation:**
1. **Whitespace Handling**: The function first skips any leading whitespaces in the input string.
2. **Sign Handling**: It then checks if the string starts with a `+` or `-` to determine if the resulting number should be positive or negative.
3. **Digit Extraction**: It processes the digits, building the number one digit at a time.
4. **Overflow and Underflow Handling**: It checks if the number exceeds the range of `Integer.MAX_VALUE` or `Integer.MIN_VALUE` and returns the respective limit.

---

## ⚙️ **Program Flow:**
The code is designed to handle various conditions and edge cases efficiently. Here's a step-by-step flow of how the function works:

### 1. **Initial Checks**:
The function first checks if the input string `s` is `null` or empty, returning `0` if true.

### 2. **Skipping Whitespace**:
It then skips any leading spaces in the string. For example:
- Input: `"   42"`
- After this step, the program continues with the string `"42"`.

### 3. **Sign Handling**:
If the string contains a sign (`+` or `-`), it determines whether the result should be negative or positive. If there is no sign, the default is positive.

- Input: `"-42"`
- After this step, the program knows to multiply the result by `-1` for the final conversion.

### 4. **Converting Digits**:
The function loops through each character in the string, checking if it's a digit. It builds the number by multiplying the previous result by 10 and adding the new digit.

- Input: `"42"`
- The result becomes `0 * 10 + 4 = 4`, then `4 * 10 + 2 = 42`.

### 5. **Overflow and Underflow Handling**:
As we keep adding digits to the result, we check if the number exceeds `Integer.MAX_VALUE` (2,147,483,647) or `Integer.MIN_VALUE` (-2,147,483,648). If it does, the function returns the corresponding limit.

- If the result exceeds `Integer.MAX_VALUE` for positive numbers or goes below `Integer.MIN_VALUE` for negative numbers, we return the respective boundaries.

### 6. **Returning the Final Result**:
Finally, the result is multiplied by the sign (`+1` or `-1`) and cast to an `int` before returning.

---

## 📚 **Code Example**:

```java
class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        long result = 0;
        int i = 0, sign = 1, n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // 2. Check if string is empty after skipping spaces
        if (i >= n) return 0;

        // 3. Check for + or -
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 4. Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // 5. Check overflow and underflow
            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (result * sign);
    }
}
```

---

## 🛠 **Why Are These Steps Used?**

### 1. **Skipping Leading Spaces**:
- **Why?**: Sometimes, numbers may be preceded by spaces, which should be ignored.
- **Example**: `"   42"` should return `42`.

### 2. **Handling Sign**:
- **Why?**: The result could be positive or negative, depending on the input string.
- **Example**: `"-42"` should return `-42`, and `"42"` should return `42`.

### 3. **Digit Conversion**:
- **Why?**: Each character of the string is converted into its corresponding numeric value, and we build the number step by step.
- **Example**: `"42"` becomes `4 * 10 + 2 = 42`.

### 4. **Overflow/Underflow Check**:
- **Why?**: To handle edge cases where the number exceeds the bounds of an integer.
- **Example**: `"2147483648"` exceeds `Integer.MAX_VALUE`, so we return `Integer.MAX_VALUE`.

### 5. **Returning the Result**:
- **Why?**: The final number is returned after applying the sign.

---

## ⚡ **Edge Cases Handled**:

1. **Leading Spaces**:  
   `"     42"` → `42`

2. **Empty Strings**:  
   `""` → `0`

3. **Sign Handling**:  
   `"   -42"` → `-42`  
   `"42"` → `42`

4. **Overflow**:  
   `"2147483648"` → `Integer.MAX_VALUE`

5. **Non-Digit Characters**:  
   `"42abc"` → `42`

---

## 💡 **Example Walkthrough**:

### Input: `"  -42"`
- **Step 1**: Skip spaces → `" -42"`
- **Step 2**: Sign is `-1` (because of `-`)
- **Step 3**: Start converting digits:
    - `result = 0 * 10 + 4 = 4`
    - `result = 4 * 10 + 2 = 42`
- **Step 4**: Multiply result by `-1` → `-42`
- **Final Output**: `-42`

---
  