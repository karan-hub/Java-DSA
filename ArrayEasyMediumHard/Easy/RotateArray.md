# 🔄 Rotate Array

## 🌟 Overview
The `RotateArray` class provides multiple implementations for rotating an array to the right by `k` positions. It includes three different methods:

1. **💡 BruteForce**: Uses an extra array to store the rotated elements.
2. **🔧 BruteForce2**: Shifts elements one by one in-place.
3. **🚀 Optimal**: Uses array reversal for an efficient solution.

---

## 📚 Methods Explained

### 1. `BruteForce(int[] nums, int k)` 🛠️
**Approach:**
- Create a temporary array of the same size as the original.
- Copy elements from index `k` onward into the new array.
- Append the first `k` elements at the end.
- Print the result.

**Visualization:**
```
Original:  [1, 2, 3, 4, 5, 6, 7]
Temp Array: [4, 5, 6, 7, 1, 2, 3] (after shifting)
```

**Code:**
```java
public static int[] BruteForce(int[] nums, int k) {
    int[] temp = new int[nums.length];
    int j = 0;

    for (int i = k; i < temp.length; i++) {
        temp[j] = nums[i];
        j++;
    }

    for (int i = 0; i < k; i++) {
        temp[j] = nums[i];
        j++;
    }
    System.out.println(Arrays.toString(temp));
    return temp;
}
```

**Example:**
```java
int[] nums = {1, 2, 3, 4, 5, 6, 7};
int k = 3;
BruteForce(nums, k);
// Output: [4, 5, 6, 7, 1, 2, 3]
```

**Complexity:**
- ⏱️ Time Complexity: **O(n)**
- 🗂️ Space Complexity: **O(n)** (uses extra array)

---

### 2. `BruteForce2(int[] nums, int k)` 🔄
**Approach:**
- Move each element one step at a time.
- Repeat this `k` times.

**Visualization:**
```
Original:  [1, 2, 3, 4, 5, 6, 7]
Step 1:    [7, 1, 2, 3, 4, 5, 6]
Step 2:    [6, 7, 1, 2, 3, 4, 5]
Step 3:    [5, 6, 7, 1, 2, 3, 4]
```

**Code:**
```java
public static int[] BruteForce2(int[] nums, int k) {
    while (k > 0) {
        int start = nums[nums.length - 1];

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = start;
        k--;
        System.out.println(Arrays.toString(nums));
    }
    return nums;
}
```

**Example:**
```java
int[] nums = {1, 2, 3, 4, 5, 6, 7};
int k = 3;
BruteForce2(nums, k);
// Output:
// [7, 1, 2, 3, 4, 5, 6]
// [6, 7, 1, 2, 3, 4, 5]
// [5, 6, 7, 1, 2, 3, 4]
```

**Complexity:**
- ⏱️ Time Complexity: **O(n * k)** (inefficient for large `k`)
- 🗂️ Space Complexity: **O(1)** (modifies in-place)

---

### 3. `Optimal(int[] arr, int k)` 🚀
**Approach:**
- Reverse the entire array.
- Reverse the first `k` elements.
- Reverse the rest of the elements.

**Visualization:**
```
Original:      [1, 2, 3, 4, 5, 6, 7]
Step 1 (Full): [7, 6, 5, 4, 3, 2, 1]
Step 2 (First k): [5, 6, 7, 4, 3, 2, 1]
Step 3 (Rest):    [5, 6, 7, 1, 2, 3, 4]
```

**Code:**
```java
public static void Optimal(int arr[], int k) {
    int len = arr.length;
    k %= len;

    reverse(arr, 0, len - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, len - 1);
    System.out.println(Arrays.toString(arr));
}

public static void reverse(int arr[], int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
```

**Example:**
```java
int[] nums = {1, 2, 3, 4, 5, 6, 7};
int k = 3;
Optimal(nums, k);
// Output: [5, 6, 7, 1, 2, 3, 4]
```

**Complexity:**
- ⏱️ Time Complexity: **O(n)**
- 🗂️ Space Complexity: **O(1)** (in-place modification)

---

## 🔑 Key Takeaways
- The **💡 brute force approach** (extra array) is simple but uses extra space.
- The **🔧 in-place shifting** is inefficient for large rotations.
- The **🚀 optimal approach** is the best choice, with **O(n) time and O(1) space**.

