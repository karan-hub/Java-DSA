## Java Solution: Finding the Second Largest Element in an Array

### 📌 Package: `ArrayEasyMediumHard.Easy;`

This Java program demonstrates multiple approaches to find the **second largest element** in an array. Additionally, the optimal approach also identifies the **second smallest element**.

🔗 **Problem Link:** [GeeksforGeeks - Second Largest Element](https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest)

---

### 🛠️ Approaches Overview:
| Approach                | Time Complexity | Space Complexity | Key Idea                                                                 |
|-------------------------|-----------------|------------------|--------------------------------------------------------------------------|
| **Brute Force (Sorting)** | `O(n log n)`    | `O(1)`           | Sort the array and pick the second last element.                         |
| **Brute Force 2 (Two-Pass)** | `O(n)`         | `O(1)`           | Find the largest in the first pass, then find the second largest.         |
| **Better Approach**      | `O(n)`         | `O(1)`           | Track the largest and second largest in a single pass.                   |
| **Optimal Approach**     | `O(n)`         | `O(1)`           | Track both the largest and smallest elements in a single pass.           |

---

## 1️⃣ Brute Force Approach (Sorting)

### 🔍 Code Flow:
1. Sort the array in ascending order.
2. Return the second last element as the second largest.

```java
package ArrayEasyMediumHard.Easy;

import java.util.Arrays;

public class BruteForceSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99 };
        System.out.println("The second largest element is: " + BruteForce(arr));
    }

    public static int BruteForce(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}
```

**🕒 Time Complexity:** `O(n log n)` due to sorting.

---

## 2️⃣ Brute Force 2 Approach (Two-Pass)

### 🔍 Code Flow:
1. Traverse the array to find the largest element.
2. Traverse again to find the largest element smaller than the maximum.

```java
package ArrayEasyMediumHard.Easy;

public class BruteForce2SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99 };
        System.out.println("The second largest element is: " + BruteForce2(arr));
    }

    public static int BruteForce2(int[] arr) {
        int max = arr[0];
        int secondmax = Integer.MIN_VALUE;
        
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        
        for (int i : arr) {
            if (i < max && i > secondmax) {
                secondmax = i;
            }
        }
        return secondmax;
    }
}
```

**🕒 Time Complexity:** `O(n)`.

---

## 3️⃣ Better Approach (Single-Pass)

### 🔍 Code Flow:
1. Traverse the array once.
2. Simultaneously track the largest and second largest elements.

```java
package ArrayEasyMediumHard.Easy;

public class BetterSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99 };
        System.out.println("The second largest element is: " + BetterApproach(arr));
    }

    public static int BetterApproach(int[] arr) {
        int max = arr[0];
        int secondmax = Integer.MIN_VALUE;
        
        for (int i : arr) {
            if (i > max) {
                secondmax = max;
                max = i;
            } else if (i > secondmax && i != max) {
                secondmax = i;
            }
        }
        return secondmax;
    }
}
```

**🕒 Time Complexity:** `O(n)`.

---

## 4️⃣ Optimal Approach (Single-Pass + Smallest Element Tracking)

### 🔍 Code Flow:
1. Traverse the array once.
2. Track the largest, second largest, smallest, and second smallest elements simultaneously.

```java
package ArrayEasyMediumHard.Easy;

public class OptimalSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99 };
        int[] result = Optimal(arr);
        System.out.println("The second largest element is: " + result[0]);
        System.out.println("The second smallest element is: " + result[1]);
    }

    public static int[] Optimal(int[] arr) {
        int max = Integer.MIN_VALUE, secondmax = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondsmallest = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > max) {
                secondmax = max;
                max = i;
            } else if (i > secondmax) {
                secondmax = i;
            }

            if (i < smallest) {
                secondsmallest = smallest;
                smallest = i;
            } else if (i < secondsmallest) {
                secondsmallest = i;
            }
        }
        return new int[]{secondmax, secondsmallest};
    }
}
```

**🕒 Time Complexity:** `O(n)`, **Space Complexity:** `O(1)`.

---

### ✅ Output Example:
```
The second largest element is: 45
The second smallest element is: 10
```

---

### 📌 Key Takeaways:
✔ **Sorting is not always the best approach** for such problems.  
✔ **Single-pass solutions** are generally more efficient.  
✔ **Tracking both smallest and largest values** can optimize certain problems.

---

### 📊 Visual Representation:

| Array Elements | Largest (`max`) | Second Largest (`secondmax`) | Smallest (`smallest`) | Second Smallest (`secondsmallest`) |
|----------------|-----------------|-----------------------------|-----------------------|-----------------------------------|
| 10             | 10              | `-∞`                        | 10                    | `∞`                               |
| 20             | 20              | 10                          | 10                    | 20                                |
| 4              | 20              | 10                          | 4                     | 10                                |
| 45             | 45              | 20                          | 4                     | 10                                |
| 99             | 99              | 45                          | 4                     | 10                                |

