# Most Profit Assigning Work

**Question ID**: 853  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1200 ms  
**Memory**: 45.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/most-profit-assigning-work

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int max=Integer.MIN_VALUE,maxProfit=0,ind=-1,tempProfit=-1;
        for(int i=0;i<worker.length;i++){
            ind=-1;
            tempProfit=-1;
            // max=Integer.MIN_VALUE;
            for(int j=0;j<difficulty.length;j++){
                if(difficulty[j]<=worker[i] && tempProfit<profit[j]){
                    // max=difficulty[j];
                    ind=j;
                    tempProfit=profit[j];
                }
            }
            maxProfit+=ind==-1?0:profit[ind];
        }
        return maxProfit;

        
    }
}
```
