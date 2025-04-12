 

## 💹 Maximum Profit from Stock Prices

This program helps you find the **maximum profit** you can make by buying and selling a stock **once**, based on daily prices.

---

### 🧩 Problem Statement

> Given an array `prices[]` where `prices[i]` is the stock price on day `i`,  
> Find the **maximum profit** you can achieve by **buying on one day and selling on another later day**.  
> If no profit is possible, return `0`.

---

### 🔢 Example

#### ✅ Input:
```java
int[] prices = {7, 1, 5, 3, 6, 4};
```

#### ✅ Output:
```
5
```

#### ✅ Explanation:
- Buy on day 1 (price = 1)  
- Sell on day 4 (price = 6)  
- Profit = 6 - 1 = **5**

---

### 👨‍💻 Code

```java
public int maximumProfit(int prices[]) {
    int maxProfit = 0;
    int bestBuy = prices[0];
    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > bestBuy)
            maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
        bestBuy = Math.min(bestBuy, prices[i]);
    }
    return maxProfit;
}
```

---

### 🔍 Program Flow (Step-by-Step)

| Step | Day (i) | Price | bestBuy | Potential Profit | maxProfit | Action                        |
|------|---------|-------|----------|------------------|-----------|-------------------------------|
| 0    | 0       | 7     | 7        | —                | 0         | Initialize                    |
| 1    | 1       | 1     | 1        | 0                | 0         | Update bestBuy (1 < 7)        |
| 2    | 2       | 5     | 1        | 4                | 4         | Update maxProfit (5 - 1 = 4)  |
| 3    | 3       | 3     | 1        | 2                | 4         | No update                     |
| 4    | 4       | 6     | 1        | 5                | 5         | Update maxProfit (6 - 1 = 5)  |
| 5    | 5       | 4     | 1        | 3                | 5         | No update                     |

---

### 🧠 Core Logic

- Keep track of the **lowest price so far** → `bestBuy`
- At each step, calculate the **profit** if we sell today
- Update the **maximum profit** seen so far

---

### 💡 Real-Life Analogy

> Imagine you're tracking stock prices daily.  
> You want to buy low and sell high — but **only once**.  
> This algorithm keeps noting the **cheapest price so far** and checks **how much profit** you'd make today.

---

### ⏱️ Time Complexity

```
O(RecursionBasic) — Single loop through the prices array
```

---

### 🧮 Space Complexity

```
O(1) — Only two variables: maxProfit and bestBuy
```

---

### 🧊 Edge Cases

| Case                         | Output |
|------------------------------|--------|
| All decreasing prices        | 0      |
| Only one price               | 0      |
| Prices always increasing     | Last - First |

---

### 💎 Summary

| ✅ Feature                 | ✔️ Covered? |
|---------------------------|-------------|
| One-pass solution         | ✅ Yes       |
| Handles all cases         | ✅ Yes       |
| Realistic & efficient     | ✅ Yes       |
| Beginner-friendly logic   | ✅ Yes       |

---
 