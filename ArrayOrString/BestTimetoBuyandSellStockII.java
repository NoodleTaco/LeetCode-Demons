class Solution {
    public int maxProfit(int[] prices) {
        int currPtr = 0;
        int futurePtr = 0;

        int profit = 0;

        while(currPtr < prices.length -1){
            futurePtr++;
            //Next Stock is Larger
            if(prices[futurePtr] > prices[currPtr]){
                profit += prices[futurePtr] - prices[currPtr];
            }
            currPtr++;
        }
        return profit;
    }
}