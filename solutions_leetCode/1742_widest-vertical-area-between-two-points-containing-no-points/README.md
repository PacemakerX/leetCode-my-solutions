# Widest Vertical Area Between Two Points Containing No Points

**Question ID**: 1742  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 41 ms  
**Memory**: 72.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0])); // increasing order
        int maxWidth=-1;
        for (int i = 0; i < points.length-1; i++) {
            if(maxWidth<points[i+1][0]-points[i][0])
            maxWidth=points[i+1][0]-points[i][0];
        }
        return maxWidth;
    }
}
```
