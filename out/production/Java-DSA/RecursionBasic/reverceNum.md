# 📖 Reverse a Number using Recursion in Java

Let's explore how recursion works using a simple yet powerful example: reversing a number in Java. We will understand recursion step by step with visual aids like a recursion tree and call stack, and explain the use of a helper function to make the code cleaner and more modular.

---

## 📅 Problem Statement
Write a Java program to reverse a number using recursion.

### Example:
```java
Input:  123
Output: 321
```

---

## 👨‍💻 Full Java Code (Using Helper Function)

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    // Public method for simplicity
    static int reverse(int number) {
        return reverseHelper(number, 0);
    }

    // Helper method to manage recursion
    private static int reverseHelper(int number, int result) {
        if (number == 0) return result;
        return reverseHelper(number / 10, result * 10 + number % 10);
    }
}
```

---

## ✨ Why Use a Helper Function?

| Without Helper Function     | With Helper Function         |
|-----------------------------|------------------------------|
| Must pass `result` manually | Cleaner call: `reverse(123)` |
| Less modular                | Better code separation       |
| More prone to misuse        | Encapsulates recursion logic |

Helper functions let us:
- Pass extra state like `result`
- Keep the public API clean
- Avoid global variables

---

## 🎨 Recursion Tree for `reverse(123, 0)`

```
reverse(123, 0)
   ↓
reverse(12, 3)
   ↓
reverse(1, 32)
   ↓
reverse(0, 321)
   ↑
 returns 321
```

Each step pe:
- `last_digit = number % 10`
- `result = result * 10 + last_digit`
- `number = number / 10`

---

## 🛠️ Execution Stack Visualization

```
Call Stack:
reverse(123, 0)
    ↳ reverse(12, 3)
        ↳ reverse(1, 32)
            ↳ reverse(0, 321)
            ↡ return 321
        ↡ return 321
    ↡ return 321
↡ return 321
```

The function calls are nested like a stack. Once base case is hit, return values bubble back up the stack.

---

## 📘 Extra Tip: What if You Use `reverse(10, 0)`?

```
reverse(10, 0)
 ↓ reverse(1, 0)
 ↓ reverse(0, 1)
↡ Output: 1
```
Because `01` is just `1` numerically. Leading zeros are not stored in integers.

---

## 🏆 Key Learnings

- **Recursion**: Breaking problem into smaller sub problems
- **Base case**: When to stop recursion
- **Helper Function**: For cleaner and modular code
- **Call Stack**: Understand how Java manages recursive calls
- **Tree Visualization**: Helps track flow of logic visually

---