class Solution {
    public int maxProfit(int[] prices) {
        
        int max_profit = 0;
        int l = 0;
        int r = 1;
            
        if(prices.length ==1){
            return 0;
        }
        
        while(r<prices.length){
            if(prices[r]-prices[l]>max_profit){
                max_profit = prices[r]-prices[l];
                r++;
                continue;
            }
            else if(prices[l]>prices[r]){
                l = r;
                r++;
                continue;
            }else{
            r++;}
        }
        
        return max_profit;
    }
}