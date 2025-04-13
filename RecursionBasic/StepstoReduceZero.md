# ⚡ Number of Steps to Reduce a Number to Zero

## 📊 Problem Statement
Given an integer `num`, return the number of steps to reduce it to zero. In one step:
- If the current number is even, divide it by 2.
- If the current number is odd, subtract 1 from it.

---

## 🔮 Recursive Solution (Java)
```java
public static int numberOfSteps(int num) {
    return helper(num, 0);
}

private static int helper(int num, int step) {
    if (num == 0) return step;
    return (num % 2 == 0)
            ? helper(num / 2, step + 1)
            : helper(num - 1, step + 1);
}
```

---

## ✅ Why This Works
### Concept Breakdown:
1. **Base Case:** If `num == 0`, we return the total steps taken.
2. **Even Case:** If `num % 2 == 0`, divide the number by 2.
3. **Odd Case:** Else, subtract 1.
4. **Recursive Call:** Call `helper` with updated number and incremented steps.

### Prefix Increment (`++step`) vs `step + 1`
- `++step` increments `step` and then uses it, but can be confusing in recursion.
- We use `step + 1` for clarity.

---

## 💡 Recursion Tree Example
### Input: `num = 5`
```
        helper(5,0)
           |
      5 is odd => 5-1 = 4
           |
        helper(4,1)
           |
      4 is even => 4/2 = 2
           |
        helper(2,2)
           |
      2 is even => 2/2 = 1
           |
        helper(1,3)
           |
      1 is odd => 1-1 = 0
           |
        helper(0,4) => return 5
```

Total steps = **5**

---

## 📁 Stack Trace Visualization
Each recursive call adds a frame to the stack:

```
Call Stack:
helper(5, 0)
helper(4, 1)
helper(2, 2)
helper(1, 3)
helper(0, 4)
<-- return 5
```

---

## 📊 Iterative Version (Alternative)
```java
public static int numberOfSteps(int num) {
    int steps = 0;
    while (num != 0) {
        if (num % 2 == 0) num /= 2;
        else num -= 1;
        steps++;
    }
    return steps;
}
```

This version avoids recursion and is better for large inputs to avoid `StackOverflowError`.

---

## 📋 Summary
| Method       | Pros                         | Cons                       |
|--------------|------------------------------|----------------------------|
| Recursive    | Clean, easy to understand    | Risk of stack overflow     |
| Iterative    | Memory-efficient             | Slightly longer code       |

- Use recursion to learn call stack and base-case patterns.
- Use iteration for performance-critical or large inputs.

---

## 📖 Bonus: Why Use Helper Function?
- It allows us to keep track of extra information (like `step`) cleanly.
- Keeps the public method signature clean.

```java
// Cleaner interface for users
public static int numberOfSteps(int num) {
    return helper(num, 0); // internal logic
}
```

---
 