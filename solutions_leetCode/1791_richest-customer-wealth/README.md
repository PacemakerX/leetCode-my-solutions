# Richest Customer Wealth

**Question ID**: 1791  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/richest-customer-wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }

            if(sum>max)
            max=sum;
            
        }
        return max;
    }
}
```
