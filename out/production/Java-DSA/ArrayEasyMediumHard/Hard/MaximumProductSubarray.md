 
 
# 🚀 Maximum Product Subarray in Java

## 🔍 Problem Statement

Given an integer array `arr[]` of size `n`, find the **contiguous subarray** within the array that has the **largest product**.

---

## ✅ Intuition

Unlike the maximum sum subarray (Kadane's Algorithm), the **product subarray** requires a different approach because:
- **Negative numbers** can flip the sign of a product.
- **Zeroes** can break the continuity of the subarray.

So, we track the product from:
1. **Left to right** (prefix).
2. **Right to left** (suffix).

At each step, we store the **maximum product so far**.

---

## 💡 Approach Explained

We use two running products:

- `fromStart` → product from **left to right**  
- `fromEnd` → product from **right to left**

### Why both directions?

Consider this array: `[-2, -3, 0, -2, -40]`

- From the left, product resets on 0.
- From the right, we might find a bigger product after 0.

---

## 🔁 Code Flow Explanation

```java
class Solution {
    int maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int fromStart = 1, fromEnd = 1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Reset to 1 if product becomes 0
            if (fromStart == 0) fromStart = 1;
            if (fromEnd == 0) fromEnd = 1;

            // Left to right product
            fromStart *= arr[i];

            // Right to left product
            fromEnd *= arr[n - 1 - i];

            // Update max so far
            max = Math.max(max, Math.max(fromStart, fromEnd));
        }
        return max;
    }
}
```

---

## 🧠 Dry Run Example

**Input:** `arr = [2, 3, -2, 4]`

- Left to right product:
  - `2 → 6 → -12 → -48`
- Right to left product:
  - `4 → -8 → -24 → -48`
- Max of all = `6`

---
 
 

## ✅ Code with Full Explanation + Dry Run
---
```java
class Solution {
    int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int maxSoFar = nums[0], minSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // Swap on negative
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update max/min products so far
            maxSoFar = Math.max(current, current * maxSoFar);
            minSoFar = Math.min(current, current * minSoFar);

            maxProd = Math.max(maxProd, maxSoFar);
        }
        return maxProd;
    }
}

```

```java
class Solution {
    int maxProduct(int[] nums) {
```
🔹 `maxProduct` is a method jo ek integer array `nums` leta hai — usmein humko **maximum product of any subarray** find karna hai.

---

```java
        int overallMaxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
```

🔹 **Initialization**:  
- `overallMaxProduct`: Final answer store karega.
- `currentMax`: Current subarray ka max product rakhta hai.
- `currentMin`: Current subarray ka min product rakhta hai (important for negative numbers).

🌟 **Example Start:**

```java
int[] nums = {-2, 3, -4}
```

So initially:

```
overallMaxProduct = -2
currentMax = -2
currentMin = -2
```

---

```java
        for (int i = 1; i < nums.length; i++) {
            int currentElement = nums[i];
```

🔹 Start loop from index `1`, kyunki index `0` se values initialize ho chuki hain.  
🔹 `currentElement` — abhi jis number pe loop chal raha hai.

---

```java
            if (currentElement < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
```

🔹 **Why this?**  
- Agar current number negative hai, toh multiply karne pe `currentMax` aur `currentMin` ka role ulta ho jaata hai.
- Isliye unko swap karte hain.

---

```java
            currentMax = Math.max(currentElement, currentElement * currentMax);
            currentMin = Math.min(currentElement, currentElement * currentMin);
```

🔹 Calculate the new `currentMax` and `currentMin`.

- `currentElement` se naye product banenge.
- Compare karte hain:
  - Kya `currentElement` hi better hai?
  - Ya usko previous `currentMax`/`currentMin` ke saath multiply karke better value milti hai?

---

```java
            overallMaxProduct = Math.max(overallMaxProduct, currentMax);
        }
```

🔹 `overallMaxProduct` update karo — compare karo current max se.

---

```java
        return overallMaxProduct;
    }
}
```

🔹 Return the final result.

---

## 🔁 DRY RUN with Example: `nums = [-2, 3, -4]`

| Step | currentElement | currentMax | currentMin | overallMaxProduct |
|------|----------------|------------|------------|-------------------|
| Init | -              | -2         | -2         | -2                |
| i=1  | 3              | max(3, -6) = 3 | min(3, -6) = -6 | max(-2, 3) = 3    |
| i=2  | -4             | ⬅️ swap needed (negative) |          |                   |
|      |                | max(-4, -4 * -6) = 24 | min(-4, -4 * 3) = -12 | max(3, 24) = 24 |

➡️ Final Answer: `24`

---

## 📌 Full Flow Summary:

1. Initialize first element as base values.
2. Traverse array from 1 to n-1:
   - If negative → swap max/min.
   - Update `currentMax`, `currentMin` using `Math.max/min`.
   - Update `overallMaxProduct`.
3. Return the answer.

---
 