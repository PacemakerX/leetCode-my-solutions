# Time Needed To Buy Tickets

**Question ID**: 2195  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 40.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/time-needed-to-buy-tickets

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int i=0;
        int count=0;
    while(tickets[k]>0){
        i=i%tickets.length;

        if(tickets[i]>0){
            tickets[i]--;
                count++;
        }
            i++;  
    }        
    return count;
    }
}
```
