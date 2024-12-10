# Best Time To Buy And Sell Stock

**Question ID**: 121  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 61.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}
```
