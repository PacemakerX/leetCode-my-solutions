# Calculate Delayed Arrival Time

**Question ID**: 2748  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 39.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/calculate-delayed-arrival-time

class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
        
    }
}
```
