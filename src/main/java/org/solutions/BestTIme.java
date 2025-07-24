package org.solutions;

public class BestTIme {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the i TH day.
You want to maximize your profit by choosing by a single day to buy one stock and choosing different day in the future to sell that stock.
Return the maximum profit you can achieve from his transaction. If you cannot achieve any profit, return 0.
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = (6-1) =5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: int this case, no transactions are done and the max profit = 0;
     */
    public int profitBrute(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int currentProfit = prices[j] - prices[i];
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        return maxProfit;
    }

    /* the current will give you correct answer. But it has time complexity of 0(n2), and space
        complexity is O(n). [7,1,5,3,6,4]
     */
    public int profitOptimal(int[] prices) {
        int minProfit = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (minProfit > price) {
                minProfit = price;
            }
            int currentProfit = price - minProfit;// it will count as profit if ith element is greater than
            // the minProfit.
            profit = Math.max(currentProfit, profit);
        }
        return profit;
    }
}

