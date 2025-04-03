## Java Solution: Finding the Second Largest Element in an Array

### 📌 Package: `ArrayEasyMediumHard.Easy;`

This Java program contains multiple approaches to find the **second largest element** in an array. It also finds the **second smallest element** in the optimal approach.

🔗 **Problem Link:** [GeeksforGeeks - Second Largest Element](https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest)

---

## 1️⃣ Brute Force Approach (Sorting)
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
**Time Complexity:** `O(n log n)` due to sorting.

---

## 2️⃣ Brute Force 2 Approach (Two-Pass)
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
**Time Complexity:** `O(n)`.

---

## 3️⃣ Better Approach (Single-Pass)
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
**Time Complexity:** `O(n)`.

---

## 4️⃣ Optimal Approach (Single-Pass + Smallest Element Tracking)
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
**Time Complexity:** `O(n)`, **Space Complexity:** `O(1)`.

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

 

