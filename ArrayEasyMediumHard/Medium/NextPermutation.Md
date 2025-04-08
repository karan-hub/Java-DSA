 
# 🔁 Next Permutation in Java
### 📁 `NextPermutation.md`

This program implements the **Next Lexicographical Permutation** of an array of integers.

---

## 📌 What is "Next Permutation"?

Given an array that represents a permutation of numbers, **the next permutation** is the **next greater permutation** in lexicographical (dictionary) order.

If such a permutation doesn't exist (i.e., the array is the highest permutation), the array is rearranged into the **lowest possible order** (i.e., sorted in ascending order).

---

## 🧠 Real-World Analogy

Think of the digits as lock combinations. You want to generate the next code that is just slightly bigger than the current one.

---

## ✅ Problem Flow – Step-by-Step

1. **Find the Pivot:**
   - Traverse the array from the right.
   - Find the first element that is smaller than its next element.
   - This is the "pivot".

2. **If no pivot found:**
   - The array is in descending order (i.e., last permutation).
   - Reverse the entire array to get the first permutation.

3. **Find Next Greater Element:**
   - Traverse from the end again.
   - Find the smallest element greater than the pivot.

4. **Swap it with the Pivot.**

5. **Reverse the subarray to the right of the pivot.**

---

## 🔍 Dry Run Example

### Input:
```
arr = [3, 4, 2, 5, 1]
```

### Step 1: Find Pivot  
From the end, compare:
```
5 > 1 ❌  
2 < 5 ✅ → pivot = index 2 (value = 2)
```

### Step 2: Find Just Greater Element  
From the end again:
```
1 > 2 ❌  
5 > 2 ✅ → swap(5, 2)
```

New array: `[3, 4, 5, 2, 1]`

### Step 3: Reverse part after pivot (index 2)  
Subarray to reverse: `[2, 1]` → becomes `[1, 2]`

Final result:  
```java
[3, 4, 5, 1, 2] ✅ (Next permutation)
```

---

## 🧑‍💻 Java Code

```java
void nextPermutation(int[] arr) {
    int n = arr.length;
    int pivot = -1;

    // Step 1: Find pivot
    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
            pivot = i;
            break;
        }
    }

    // Step 2: If no pivot, reverse whole array
    if (pivot == -1) {
        reverse(arr, 0, n - 1);
        return;
    }

    // Step 3: Find next greater element to the right of pivot
    for (int i = n - 1; i > pivot; i--) {
        if (arr[i] > arr[pivot]) {
            swap(arr, i, pivot);
            break;
        }
    }

    // Step 4: Reverse the part after pivot
    reverse(arr, pivot + 1, n - 1);
}

void reverse(int[] arr, int start, int end) {
    while (start < end) {
        swap(arr, start, end);
        start++;
        end--;
    }
}

void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

---

## 📈 Time & Space Complexity

| Complexity | Value        | Explanation                                      |
|------------|--------------|--------------------------------------------------|
| Time       | O(n)         | One pass to find pivot + one pass to reverse     |
| Space      | O(1)         | In-place manipulation of the array               |

---
 