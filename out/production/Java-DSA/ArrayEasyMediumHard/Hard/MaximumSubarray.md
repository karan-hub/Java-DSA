 

## 📌 Maximum Subarray Sum — Kadane's Algorithm

This program finds the **maximum sum of a contiguous subarray** using **Kadane's Algorithm**, which runs in linear time.

---

### ✅ Problem Statement

> Given an integer array `arr[]`, find the **maximum sum** that can be formed by any **contiguous subarray** (subarray means elements must be continuous in the array).

---

### 📎 Example

#### 🔢 Input:
```java
int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
```

#### ✅ Output:
```
6
```

#### 📈 Explanation:
The subarray `[4, -1, 2, 1]` has the maximum sum: `4 + (-1) + 2 + 1 = 6`

---

### 👨‍💻 Code

```java
int maxSubarraySum(int[] arr) {
    int Sum = Integer.MIN_VALUE, currentSum = 0;
    for (int num : arr) {
        currentSum += num;
        Sum = Math.max(Sum, currentSum);
        if (currentSum < 0) currentSum = 0;
    }
    return Sum;
}
```

---

### 🧠 How It Works (Flow)

| Step | Variable | Action |
|------|----------|--------|
| 🔁 Loop | `for (int num : arr)` | Go through each element one by one |
| ➕ Add | `currentSum += num` | Add current number to ongoing sum |
| 📊 Update Max | `Sum = Math.max(Sum, currentSum)` | If this sum is greater than any previous sum, update it |
| 🔄 Reset | `if (currentSum < 0) currentSum = 0;` | If currentSum becomes negative, reset it to zero |

---

### 💡 Why `Integer.MIN_VALUE`?

If all array elements are **negative**, the original code (with `Sum = 0`) would return `0`, which is wrong.  
Example:

```java
arr = {-3, -2, -1};  // Max subarray sum = -1
```

So we start with:

```java
int Sum = Integer.MIN_VALUE;
```

This ensures **even the least negative number is considered**.

---

### 🔍 Dry Run Example

Let's dry run on:  
```java
arr = [-2, 1, -3, 4]
```

| i | num | currentSum | Sum  | Action                         |
|---|-----|------------|------|--------------------------------|
| 0 | -2  | -2         | -2   | new max sum (-2)               |
| 1 | 1   | 1          | 1    | better than -2, update         |
| 2 | -3  | -2         | 1    | drop below 0 → reset currentSum |
| 3 | 4   | 4          | 4    | max sum so far                 |

---

### ⏱️ Time Complexity

```
O(RecursionBasic) — Only one pass through the array.
```

---

### 🧠 Space Complexity

```
O(1) — Only a few variables used.
```

---

### 🧊 Edge Cases Handled

- All negative numbers → ✅
- Mix of positive and negative → ✅
- All positive numbers → ✅

---

### ✨ Summary

| ✅ Feature                | ✔️ Covered? |
|--------------------------|------------|
| Works for all negatives  | ✅ Yes       |
| Clean one-pass solution  | ✅ Yes       |
| Constant space used      | ✅ Yes       |
| Beginner-friendly logic  | ✅ Yes       |

---
 