package ArrayEasyMediumHard.Medium;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 2, 5, 3, 6, 4 ,1,20,23 };
        System.out.println("Maximum profit: " + Profit(prices));

    }

    public static int Profit(int[] prices) {

        int maxProfit = 0, buyStock = prices[0];
        for (int price : prices) {
            if (price > buyStock) {
                maxProfit = Math.max(maxProfit, price - buyStock);
            }

            buyStock = Math.min(buyStock, price);
        }
 
        
        return maxProfit;

    }
}
