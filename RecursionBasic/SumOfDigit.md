
# 🔢 Recursive Digit Sum in Java

This Java program takes an integer and recursively calculates the **sum of its digits**.

---

## 🧠 What does the code do?

For any given number, it performs the following:

- Splits the number into individual digits
- Adds the digits recursively
- Uses **modulus (%)** and **integer division (/)** to break down the number

---

## 🧾 Full Java Code

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(54321));
    }

    static int sum(int number) {
        if (number == 0) return 0;
        return (number % 10) + sum(number / 10);
    }
}
```

---

## 📌 Line-by-Line Explanation

| Line | Description |
|------|-------------|
| `public class Main` | Defines the class `Main`. |
| `public static void main(String[] args)` | Java entry point of the program. |
| `System.out.println(sum(54321));` | Calls the `sum()` method and prints the result. |
| `static int sum(int number)` | A recursive method that returns the sum of digits. |
| `if (number == 0) return 0;` | Base case: If number is 0, stop recursion. |
| `return (number % 10) + sum(number / 10);` | Recursive case: Add the last digit to the result of recursive call with the remaining digits. |

---

## 🌳 Recursive Tree for `sum(54321)`

```
                        sum(54321)
                            |
                            ├── 54321 % 10 = 1
                            ↓
                        sum(5432)
                            ├── 5432 % 10 = 2
                            ↓
                        sum(543)
                            ├── 543 % 10 = 3
                            ↓
                        sum(54)
                            ├── 54 % 10 = 4
                            ↓
                        sum(5)
                            ├── 5 % 10 = 5
                            ↓
                        sum(0)  ← base case

```

🧮 Total = 1 + 2 + 3 + 4 + 5 = **15**

---

## 📥 Stack Call Flow (How recursion works)

Here’s how the **call stack** builds up and collapses:

```
CALL STACK (pushing calls):

sum(54321)
→ sum(5432)
→ sum(543)
→ sum(54)
→ sum(5)
→ sum(0) // base case reached

RETURN STACK (popping calls):

sum(0) = 0
→ sum(5) = 5 + 0 = 5
→ sum(54) = 4 + 5 = 9
→ sum(543) = 3 + 9 = 12
→ sum(5432) = 2 + 12 = 14
→ sum(54321) = 1 + 14 = 15
```

✅ Final Output: **15**

---

## 🎯 Key Concepts Used

- ✅ **Recursion**: Function calls itself with smaller input
- ✅ **Base Case**: `if(number == 0) return 0;` stops the recursion
- ✅ **Modulus Operator `%`**: Gets the last digit
- ✅ **Integer Division `/`**: Removes the last digit

---

## ✨ Output

```bash
15
```

---

## 🧡 Bonus Tip: Want to show the steps?

Add this line inside the `sum()` method:

```java
System.out.println("Current digit: " + (number % 10));
```

It will print each digit being added.

---

## 📘 Author Notes

- This is a classic example of **recursion on digits**.
- You can modify this to find product of digits or reverse the number too.
- Always remember to handle edge cases like negative numbers if needed.

--- 