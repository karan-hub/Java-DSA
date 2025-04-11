 

## 📈 **Maximum Profit in Stock Buy-Sell (Multiple Transactions Allowed)**

This solution finds the **maximum total profit** from multiple buy-sell transactions on given stock prices — where **you can buy and sell multiple times**, but you **must sell before buying again**.

---

### 🔍 Problem Statement

> Given an array `prices[]` representing stock prices on `n` consecutive days,  
> You can **buy and sell multiple times**.  
> Find the **maximum profit** you can make.  
> (You **cannot hold more than one stock at a time**.)

---

### ✨ Example

#### ✅ Input:
```java
int[] prices = {1, 5, 3, 8, 12};
```

#### ✅ Output:
```
13
```

#### ✅ Explanation:

| Buy Day | Buy Price | Sell Day | Sell Price | Profit |
|---------|------------|-----------|-------------|--------|
| Day 0   | 1          | Day 1     | 5           | 4      |
| Day 2   | 3          | Day 4     | 12          | 9      |
| **Total Profit**                         | **13**   |

---

### 💻 Code

```java
public int maximumProfit(int prices[]) {
    int MaxProfit = 0;
    int n = prices.length;
    for (int i = 1; i < n; i++) {
        if (prices[i] > prices[i - 1])
            MaxProfit += prices[i] - prices[i - 1];
    }
    return MaxProfit;
}
```

---

### 🔁 Dry Run Example

Input: `{1, 5, 3, 8, 12}`

| Day (i) | prices[i-1] | prices[i] | Action               | Profit |
|---------|-------------|------------|------------------------|--------|
| 1       | 1           | 5          | Buy at 1, Sell at 5   | +4     |
| 2       | 5           | 3          | No action             | 0      |
| 3       | 3           | 8          | Buy at 3, Sell at 8   | +5     |
| 4       | 8           | 12         | Buy at 8, Sell at 12  | +4     |
|         |             |            | **Total**             | **13** |

---

### 🤔 Why This Works

> You don’t need to **exactly track buy/sell days** —  
> Just **add every increasing difference** (i.e., `prices[i] > prices[i-1]`)  
> That's your profit, and it covers all possible best transactions!

---

### ⏱️ Time & Space Complexity

| Metric            | Value         |
|-------------------|----------------|
| **Time Complexity** | `O(n)`         |
| **Space Complexity**| `O(1)`         |

---

### ⚠️ Edge Cases

| Input               | Output | Reason                             |
|---------------------|--------|-------------------------------------|
| `{5, 4, 3, 2, 1}`   | `0`    | Prices always decreasing            |
| `{1}`              | `0`    | Only one price day                  |
| `{3, 3, 3}`        | `0`    | No increase = no profit             |

---

### 🔍 Real-Life Analogy

> Imagine you're watching a stock daily. Every time its price goes up the next day, you **buy the day before and sell the next day**. You’re capturing every **small climb**, which adds up to the **maximum total profit** 📈

---

### 🧠 Summary

| ✅ Feature                         | ✔️ Covered |
|-----------------------------------|------------|
| Multiple Transactions Allowed     | ✅ Yes     |
| Tracks only positive differences  | ✅ Yes     |
| One-pass Efficient Logic          | ✅ Yes     |
| Beginner Friendly                 | ✅ Yes     |

---
 