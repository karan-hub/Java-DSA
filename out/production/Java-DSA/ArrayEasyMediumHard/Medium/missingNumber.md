 
 
# 🚀 Find the Smallest Missing Positive Number

## 📌 Problem Statement

Given an unsorted integer array, find the **smallest positive number** that is **missing** from the array.

---

## ✅ Approach: Index Placement (Cyclic Sort)

### 🧠 Intuition:

We try to **place each positive integer `x` (1 to RecursionBasic)** at the index `x - 1` in the array.  
If a number is already at the right place, we move on.  
Finally, we scan the array and return the **first index `i`** where `arr[i] != i + 1`.

---

## 📦 Java Implementation

```java
public int missingNumber(int[] arr) {
    int RecursionBasic = arr.length;

    // Step 1: Place each number at its correct index if in range 1 to RecursionBasic
    for (int i = 0; i < RecursionBasic; i++) {
        while (arr[i] > 0 && arr[i] <= RecursionBasic && arr[arr[i] - 1] != arr[i]) {
            int correctIndex = arr[i] - 1;
            int temp = arr[i];
            arr[i] = arr[correctIndex];
            arr[correctIndex] = temp;
        }
    }

    // Step 2: Find the first index where arr[i] != i + 1
    for (int i = 0; i < RecursionBasic; i++) {
        if (arr[i] != i + 1) return i + 1;
    }

    // Step 3: If all numbers are in place, return RecursionBasic+1
    return RecursionBasic + 1;
}
```

---

## 🧪 Example

### Input:
```
arr = [3, 4, -1, 1]
```

### Step-by-Step Flow:

| Index | Value | Action                      |
|-------|--------|-----------------------------|
| 0     | 3      | Swap with arr[2] → `[-1, 4, 3, 1]` |
| 0     | -1     | Skip (invalid)              |
| 1     | 4      | Swap with arr[3] → `[-1, 1, 3, 4]` |
| 1     | 1      | Swap with arr[0] → `[1, -1, 3, 4]` |
| 2     | 3      | Already at correct index    |
| 3     | 4      | Already at correct index    |

Now final array:
```
[1, -1, 3, 4]
```

### Final Scan:

- arr[0] = 1 → ok  
- arr[1] ≠ 2 → ✅ **Missing = 2**

### Output:
```
2
```

---

## ⏱ Time & Space Complexity

| Metric            | Value                        |
|-------------------|------------------------------|
| 🕒 Time Complexity | O(RecursionBasic) *(best & worst case)*   |
| 🧠 Space Complexity| O(1) *(in-place modification)* |

---

## ✨ Key Points

- Ignore negative, zero, and out-of-bound values (> RecursionBasic)
- Place numbers at correct indices `arr[i] - 1`
- Final pass gives the smallest missing number

---

## 📚 Use Case

Perfect for:
- Interview questions
- DSA prep
- Systematic handling of edge cases (negative, duplicates)

---

## 💡 Tip

This technique is called **Cyclic Sort** and is extremely powerful for solving **index-placement based problems** efficiently.

---

## 🧪 More Test Cases

| Input                | Output |
|----------------------|--------|
| `[1, 2, 0]`          | `3`    |
| `[7, 8, 9, 11, 12]`  | `1`    |
| `[1, 2, 3, 4, 5]`    | `6`    |
| `[-3, -1, 0]`        | `1`    |
| `[2, 1, 1, 4, 2]`    | `3`    |

---
 