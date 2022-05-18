package Easy;

public class Stock {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }


    static public int maxProfit (int[] prices) {
        int buy = Integer.MAX_VALUE, sell = Integer.MIN_VALUE, profit = Integer.MIN_VALUE;

        for ( int i = 0; i < prices.length; i++ ) {
            // First looking a perfect day for buying stock.
            if ( buy > prices[i] ) {
                buy = prices[i];
                sell = prices[i];
            }
            // Once I bought the stock looking for another day to sell the stock
            if ( sell < prices[i] ) {
                sell = prices[i];
            }

            // Once stock is gone then checking did I make profit or not.
            if ( profit < (sell-buy) ) {
                profit = (sell-buy);
            }
        }

        return profit;
    }
}
