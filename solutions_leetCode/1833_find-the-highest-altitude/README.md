# Find The Highest Altitude

**Question ID**: 1833  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-the-highest-altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int[] points = new int[gain.length + 1];
        points[0] = 0;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            points[i+1] = sum;
            if (max < points[i+1])
                max = points[i+1];

        }
        return max; 
    }
}
```
