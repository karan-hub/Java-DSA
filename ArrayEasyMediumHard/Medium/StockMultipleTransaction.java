package ArrayEasyMediumHard.Medium;

public class StockMultipleTransaction {
    public static void main(String[] args) {
        StockMultipleTransaction stock = new StockMultipleTransaction();
        int prices[] = {100, 180, 260, 310, 40, 535, 695};
        int profit = stock.maximumProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }

    public int maximumProfit(int prices[]) {
        // code here

        int MaxProfit = 0;

        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1])
                MaxProfit += prices[i] - prices[i - 1];
        }
        return MaxProfit;
    }

}
