# Modify The Matrix

**Question ID**: 3330  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 45.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/modify-the-matrix

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {

    int [][] ans = new int[matrix.length][matrix[0].length];

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){

            if(matrix[i][j]!=-1)
            ans[i][j]=matrix[i][j];
            else
            ans[i][j]=findMax(matrix,j);
        }        
    }
        return ans;
    }

    public int findMax(int [][] matrix,int j){

        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
            max=Math.max(max,matrix[i][j]);
        
        return max;
    }
}
```
