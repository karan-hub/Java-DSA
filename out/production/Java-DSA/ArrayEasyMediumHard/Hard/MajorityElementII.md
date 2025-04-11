# Majority Elements II
 markdown
# 🔍 Find All Majority Elements (Appearing More Than ⌊n/3⌋ Times)

## 🚀 Problem Statement
Given an array of size `n`, find **all elements that appear more than ⌊n/3⌋ times**.

➡️ You are allowed to use only `O(1)` space (excluding the result list).

---

## 💡 Intuition & Concept

You can **have at most 2 elements** that appear more than ⌊n/3⌋ times.

Why?

Let’s say we had 3 elements that appeared more than n/3 times.

Then their **combined count would be > n**, which is impossible.  
Hence, there can be **at most 2 majority elements** in this case.

---

## 🧠 Algorithm – Boyer-Moore Majority Voting (Extended for n/3)

### ✅ Step-by-step logic:

1. **First pass:**  
   Find two potential candidates who *might* be majority elements.

2. **Second pass:**  
   Count the actual occurrences of these two candidates.

3. **Return the ones whose count > ⌊n/3⌋**.

---

## 🔁 Program Flow with Example

### Input:
```java
int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
```

### Dry Run:

- Initial: `num1 = -1`, `num2 = -1`, `frq1 = 0`, `frq2 = 0`

Traverse array:

```
→ 1: frq1 = 1, num1 = 1
→ 1: frq1 = 2
→ 1: frq1 = 3
→ 3: frq2 = 1, num2 = 3
→ 3: frq2 = 2
→ 2: frq1--, frq2-- → frq1 = 2, frq2 = 1
→ 2: frq1--, frq2-- → frq1 = 1, frq2 = 0
→ 2: frq2 = 1, num2 = 2
```

Final candidates = `num1 = 1`, `num2 = 2`

### Second pass:
- Count 1 = 3
- Count 2 = 3
- n = 8 → ⌊n/3⌋ = 2

✅ Both `1` and `2` are valid answers.

---

## ✅ Final Code

```java
class Solution {
    public List<Integer> findMajority(int[] nums) {
        int num1 = -1, num2 = -1;
        int frq1 = 0, frq2 = 0;
        int n = nums.length;

        for (int num : nums) {
            if (num == num1) {
                frq1++;
            } else if (num == num2) {
                frq2++;
            } else if (frq1 == 0) {
                num1 = num;
                frq1 = 1;
            } else if (frq2 == 0) {
                num2 = num;
                frq2 = 1;
            } else {
                frq1--;
                frq2--;
            }
        }

        // Count actual occurrences
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int threshold = n / 3;
        if (count1 > threshold) result.add(num1);
        if (count2 > threshold) result.add(num2);

        Collections.sort(result);
        return result;
    }
}
```

---

## 🧮 Time & Space Complexity

| Complexity | Value        |
|------------|--------------|
| ⏱️ Time     | `O(n)`       |
| 💾 Space    | `O(1)` extra (excluding result list) |

---

## 🧪 More Test Cases

### Test Case 1
```java
Input: [3,2,3]
Output: [3]
```

### Test Case 2
```java
Input: [1,1,1,3,3,2,2,2]
Output: [1,2]
```

### Test Case 3
```java
Input: [1,2,3]
Output: []
```

---

## 📝 Key Takeaways

- If the majority threshold is `n/2`, you can have only 1 majority element.
- If the threshold is `n/3`, you can have **at most 2**.
- Boyer-Moore Voting is powerful for constant space majority element search.

---
 