# Largest Odd Number in a String

 
## Problem Statement

Given a string `num` consisting of digits, the task is to find the largest odd number that can be formed as a prefix of the string. If no odd number exists, return an empty string.

---

## Code Implementation

```java
package StringsBasicMedium;

public class LargestOddNumStr {
    public static void main(String[] args) {
        
        LargestOddNumStr solution = new LargestOddNumStr();
        System.out.println(solution.largestOddNumber("52")); // Output: "5"
        System.out.println(solution.largestOddNumber("4206")); // Output: ""
        System.out.println(solution.largestOddNumber("35427")); // Output: "35427"
    }
    public String largestOddNumber(String num) {
        for (int i = num.length()-1; i >=0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 !=0) return num.substring(0, i+1);
        }
     
        return  "";
    }
}
```

---

## Explanation of the Logic

1. **Iterate from the End**:  
   Start iterating the string `num` from the last character to the first. This ensures that the largest possible prefix is checked first.

2. **Check for Odd Digit**:  
   For each character, check if it represents an odd digit. This is done using the condition:
   ```java
   if ((ch - '0') % 2 != 0)
   ```
   Here, `ch - '0'` converts the character to its integer value.

3. **Return the Prefix**:  
   If an odd digit is found, return the substring from the start of the string to the current position (inclusive).

4. **Return Empty String**:  
   If no odd digit is found after iterating through the entire string, return an empty string.

---

## Example Walkthrough

### Input: `"35427"`

1. Start from the last digit:  
   - `'7'` is odd → Return `"35427"`.

### Input: `"4206"`

1. Start from the last digit:  
   - `'6'` is even → Continue.  
   - `'0'` is even → Continue.  
   - `'2'` is even → Continue.  
   - `'4'` is even → End of string.  
   - No odd digit found → Return `""`.

---

## Visual Representation of Program Flow

### Step-by-Step Example Walkthrough

#### Input: `"35427"`

1. **Start from the Last Digit**:  
    Begin checking from the last digit of the string.

2. **Check if the Digit is Odd**:  
    - `'7'` → Odd → Return the prefix `"35427"`.

#### Input: `"4206"`

1. **Start from the Last Digit**:  
    Begin checking from the last digit of the string.

2. **Check if the Digit is Odd**:  
    - `'6'` → Even → Continue.  
    - `'0'` → Even → Continue.  
    - `'2'` → Even → Continue.  
    - `'4'` → Even → End of string.

3. **No Odd Digit Found**:  
    Return an empty string `""`.

 

---

## Complexity Analysis

- **Time Complexity**:  
  The program iterates through the string once, so the time complexity is **O(n)**, where `n` is the length of the string.

- **Space Complexity**:  
  The program uses constant space, so the space complexity is **O(1)**.

---

## Test Cases

| Input    | Output   | Explanation                              |
|----------|----------|------------------------------------------|
| `"52"`   | `"5"`    | The largest odd prefix is `"5"`.         |
| `"4206"` | `""`     | No odd digit exists in the string.       |
| `"35427"`| `"35427"`| The entire string is the largest prefix. |

---
 