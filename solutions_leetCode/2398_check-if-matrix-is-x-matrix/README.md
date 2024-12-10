# Check If Matrix Is X Matrix

**Question ID**: 2398  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 43.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/check-if-matrix-is-x-matrix

class Solution {
    public  boolean checkXMatrix(int[][] grid) {
        // boolean bool = true;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] == 0 || grid[i][grid.length - 1 - i] == 0) {
                return false;
            }
        }
        return  checkOther(grid);
    }

    public  boolean checkOther(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i != j && j != grid.length - 1 - i)
                    if (grid[i][j] != 0)
                        return false;
            }
        }
        return true;
    }
}
```
