import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int profit=0;
        int maxprofit =0;
        int cheapest=1000000;
        for(left=0;left<prices.length;left++){
            cheapest=Math.min(cheapest,prices[left]);
            profit=prices[left] - cheapest;
            maxprofit=Math.max(maxprofit,profit);
        }
        if(maxprofit<0){
            return 0;
        }
        else{
            return maxprofit;
        }
    }
}