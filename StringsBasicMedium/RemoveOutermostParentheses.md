
# 🧠 Remove Outermost Parentheses

This program removes the **outermost parentheses** from each primitive valid parentheses substring.  
It’s a common interview question and helps you understand **stack-like logic** using a simple counter! 💡

---

## 📌 What’s the Problem?

You are given a valid parentheses string like:

```
(()())(())
```

Your task is to remove the **outer layer** of every group of balanced parentheses.

---

### ✅ Example:

**Input:** `"(()())(())"`

**Visual Explanation:**

Let’s break it down visually:

```
Original:   ( ( ) ( ) ) ( ( ) )
               🔲       🔲     <- outermost parentheses
After removing:
            ( ) ( ) ( )
```

**Output:**  
```
"()()()"
```

---

## 🧠 How Does It Work?

### Approach 1: Counter-Based Logic

We use a **counter** to track how deep we are inside the parentheses.

- Every time we see `'('`, we increase the counter.
- Every time we see `')'`, we decrease it.
- If the counter is **not zero**, we add the character to the result (because it's not the outermost one).

---

### 👨‍💻 Java Code (Counter-Based)

```java
package StringsBasicMedium;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        RemoveOutermostParentheses obj = new RemoveOutermostParentheses();
        String input = "(()())(())";
        String result = obj.removeOuterParentheses(input);
        System.out.println("Result: " + result);
    }

    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') count--;
            if (count != 0) ans.append(s.charAt(i));
            if (s.charAt(i) == '(') count++;
        }
        return ans.toString();
    }
}
```

---

### Approach 2: Stack-Based Logic

We can also solve this problem using a **stack** to track the parentheses.

- Push `'('` onto the stack and add it to the result only if the stack is not empty after the push.
- Pop `')'` from the stack and add it to the result only if the stack is not empty before the pop.

---

### 👨‍💻 Java Code (Stack-Based)

```java
import java.util.Stack;

public class RemoveOutermostParenthesesStack {
    public static void main(String[] args) {
        RemoveOutermostParenthesesStack obj = new RemoveOutermostParenthesesStack();
        String input = "(()())(())";
        String result = obj.removeOuterParentheses(input);
        System.out.println("Result: " + result);
    }

    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (!stack.isEmpty()) ans.append(c);
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
                if (!stack.isEmpty()) ans.append(c);
            }
        }
        return ans.toString();
    }
}
```

---

## 🔍 Step-by-Step Trace (Counter-Based)

Let’s trace the input `"(()())(())"` step by step:

| Char | Count Before | Add to Result? | Count After | Result So Far |
|------|--------------|----------------|-------------|---------------|
| `(`  | 0            | ❌             | 1           |               |
| `(`  | 1            | ✅             | 2           | `(`           |
| `)`  | 2            | ✅             | 1           | `()`          |
| `(`  | 1            | ✅             | 2           | `()(`         |
| `)`  | 2            | ✅             | 1           | `()()`        |
| `)`  | 1            | ❌             | 0           | `()()`        |
| `(`  | 0            | ❌             | 1           | `()()`        |
| `(`  | 1            | ✅             | 2           | `()()(`       |
| `)`  | 2            | ✅             | 1           | `()()()`      |
| `)`  | 1            | ❌             | 0           | `()()()`      |

---

## 🧪 Test More Inputs

Try running with:

```java
System.out.println(obj.removeOuterParentheses("(()())(())(()(()))"));
// Output: "()()()()(())"
```

---

## 🚀 Summary

### Counter-Based Approach:
✅ Tracks nested parentheses using a counter  
✅ Skips outermost `()`  
✅ Builds result only with inner brackets  

**Time Complexity:** O(n) - We traverse the string once.  
**Space Complexity:** O(1) - Only a counter and a `StringBuilder` are used.

### Stack-Based Approach:
✅ Uses a stack to track parentheses  
✅ Adds to result only when stack is not empty  

**Time Complexity:** O(n) - We traverse the string once.  
**Space Complexity:** O(n) - Stack space depends on the depth of nested parentheses.

---