# Buy Two Chocolates

**Question ID**: 2756  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 43.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/buy-two-chocolates

class Solution {
    public int buyChoco(int[] prices, int money) {
         int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (min1 > prices[i]) {
                min2 = min1;
                min1 = prices[i];
            } else if (min2 >= prices[i])
                min2 = prices[i];

        }
        return money-(min1+min2)>=0?money-(min1+min2):money;
       }
}
```
