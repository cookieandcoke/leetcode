package com.github.cookieandcoke;

/**
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Q121 {
    public int maxProfit(int[] prices) {
        int p=0,low=prices[0];
        for(int i=1; i<prices.length; i++) {
            if(prices[i]-low > p)
                p=prices[i]-low;
            if(low>prices[i])
                low = prices[i];
        }
        return p;
    }
}
