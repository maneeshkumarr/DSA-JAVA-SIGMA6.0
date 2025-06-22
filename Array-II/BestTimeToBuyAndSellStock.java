// BestTimeToBuyAndSellStock.java

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // buy at lower price
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit); // sell for max profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Sample input
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}

/*
Dry Run Example:
Input: [7, 1, 5, 3, 6, 4]

Step-by-step:
minPrice = ∞, maxProfit = 0

price = 7 → minPrice = 7
price = 1 → minPrice = 1
price = 5 → profit = 4 → maxProfit = 4
price = 3 → profit = 2 → maxProfit = 4 (unchanged)
price = 6 → profit = 5 → maxProfit = 5 (updated)
price = 4 → profit = 3 → maxProfit = 5 (unchanged)

Final maxProfit = 5
Output: Maximum Profit: 5
*/
