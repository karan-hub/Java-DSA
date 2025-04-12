# 🏆 Remove Duplicates from Sorted Array (LeetCode)

🔗 **Problem Link:** [LeetCode 26 - Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## 🚀 Problem Statement:
Given an integer array `nums` sorted in **non-decreasing order**, remove the **duplicates in-place** such that each unique element appears only **once**. The relative order of the elements should be **kept the same**.

**Return the length** of the modified array and ensure the first part of `nums` contains the unique elements.

---

## 📝 Approach: Two-Pointer Technique

### 🔹 Key Idea:
- Since the array is **sorted**, duplicates are always adjacent.
- We use **two pointers**: one (`j`) to track the position of unique elements and another (`i`) to iterate through the array.
- If `nums[i]` is different from `nums[j-1]`, we place it at `nums[j]` and move `j` ahead.

### ✨ Code Implementation:
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
```

### 📌 Dry Run Example:

#### **Input:**
```plaintext
nums = [1, 1, 2, 2, 3, 4, 4, 5]
```
#### **Visualization of Each Step:**
| Step | `i` | `j` | `nums` (Updated In-place) |
|------|----|----|----------------------|
| 1️⃣ | 1  | 1  | `[1, 1, 2, 2, 3, 4, 4, 5]` |
| 2️⃣ | 2  | 2  | `[1, 2, 2, 2, 3, 4, 4, 5]` |
| 3️⃣ | 3  | 2  | `[1, 2, 2, 2, 3, 4, 4, 5]` |
| 4️⃣ | 4  | 3  | `[1, 2, 3, 2, 3, 4, 4, 5]` |
| 5️⃣ | 5  | 4  | `[1, 2, 3, 4, 3, 4, 4, 5]` |
| 6️⃣ | 6  | 4  | `[1, 2, 3, 4, 3, 4, 4, 5]` |
| 7️⃣ | 7  | 5  | `[1, 2, 3, 4, 5, 4, 4, 5]` |

#### **Output:**
```plaintext
Unique elements count = 5
Modified nums = [1, 2, 3, 4, 5, _, _, _]
```
(`_` represents leftover elements, ignored after `j`)

---

## ⏳ Complexity Analysis:
| Time Complexity | Space Complexity |
|----------------|----------------|
| **O(RecursionBasic)** (Single pass through array) | **O(1)** (In-place modification) |

### 🔥 Why This Works Well?
✅ **Efficient:** Uses only a single loop (linear time).
✅ **In-place:** No extra memory needed.
✅ **Preserves Order:** Only unique elements remain in sorted order.

---

### 💡 Key Takeaways:
- **Sorted arrays** allow us to use a **two-pointer** approach efficiently.
- **In-place modification** ensures we use **constant space**.
- Understanding **array manipulation techniques** is essential for optimizing solutions in coding interviews!

Happy coding! 🚀😃

