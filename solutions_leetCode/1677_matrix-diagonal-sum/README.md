# Matrix Diagonal Sum

**Question ID**: 1677  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 44.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/matrix-diagonal-sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i =0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i!=(mat.length-1-i))
            sum+=mat[i][mat.length-1-i];
        }
        return sum;
    }
}
```
