 
 
# ☀️ Maximum Circular Subarray Sum using Kadane’s Algorithm

This Java program finds the **maximum sum of a subarray** in a **circular array** using **Kadane’s Algorithm**.

---

## ✅ Problem Explanation

In a **circular array**, the last element is connected to the first. So, subarrays can wrap around the end.

Example:
```
arr = [5, -2, 3, 4]
Normal max subarray: [5, -2, 3, 4] = 10  
Circular max subarray: [3, 4, 5] = 12 (wrap around)  
Answer = 12
```

---

## 💡 Approach

We use two applications of **Kadane’s Algorithm**:
1. **Max Subarray Sum (Normal case)** → `maxKadanse`
2. **Min Subarray Sum** → `minKadanse`, to calculate circular max using:
   ```java
   circularMax = totalSum - minKadanse
   ```
   
****
### 🔁 Why this works?

Because in a circular subarray, **excluding the minimum subarray** gives the **maximum wrapped sum**.

---

## 🧠 Step-by-Step Flow

```java
public int circularSubarraySum(int arr[]) {
    int totalSum = 0;

    // Step 1: Initialize max and min subarrays
    int maxKadanse = arr[0], maxEndingKadanse = arr[0];
    int minKadanse = arr[0], minEndingKadanse = arr[0];

    // Step 2: Loop from index 1 to end
    for (int i = 1; i < arr.length; i++) {
        int num = arr[i];
        totalSum += num;

        // Update for max subarray (Kadane’s)
        maxEndingKadanse = Math.max(num, maxEndingKadanse + num);
        maxKadanse = Math.max(maxKadanse, maxEndingKadanse);

        // Update for min subarray
        minEndingKadanse = Math.min(num, minEndingKadanse + num);
        minKadanse = Math.min(minKadanse, minEndingKadanse);
    }

    // Add the first element to totalSum (missed in loop)
    totalSum += arr[0];

    // Step 3: If all numbers are negative, return the max single element
    if (maxKadanse < 0) return maxKadanse;

    // Step 4: Return the max of normal and circular
    return Math.max(maxKadanse, totalSum - minKadanse);
}
```

---

## 🔍 Dry Run Example

Input:
```java
arr = [8, -1, 3, 4]
```

Loop-wise:
- totalSum = 14
- maxKadanse (normal subarray): `8 + (-1) + 3 + 4 = 14`
- minKadanse (min subarray): `-1`
- circular sum = `14 - (-1) = 15`  
  ✅ Final Answer = `Math.max(14, 15) = 15`

---

## 📌 Key Points

- `maxKadanse` gives max subarray sum (no wrapping)
- `totalSum - minKadanse` gives max circular sum (wrapping)
- If all elements are negative, use `maxKadanse` directly

---
 