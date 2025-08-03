package Day2;

public class Q1_BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = 0;
        int sell = 1;
        int p = 0;
        int maxP = 0;

        while(sell < n){
            if(prices[buy]<prices[sell]){
                p = prices[sell] - prices[buy];
                maxP = Math.max(p,maxP);
            }else{
                buy=sell;
            }
            sell++;
        }
        return maxP;
    }
}
