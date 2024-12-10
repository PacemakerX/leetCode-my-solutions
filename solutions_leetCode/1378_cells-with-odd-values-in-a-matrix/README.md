# Cells With Odd Values In A Matrix

**Question ID**: 1378  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 41.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
     int[][] nums = new int[m][n];
        
        int count = 0;
        for (int[] is : indices) {
            increaseRows(nums, is[0]);
            increaseColoumns(nums, is[1]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] % 2 != 0)
                    count++;
            }

        }

        return count;
    }

    public  void increaseRows(int[][] nums, int rows) {
        for (int i = 0; i < nums[0].length; i++) {
            nums[rows][i]++;
            

        }
    }

    public  void increaseColoumns(int[][] nums, int coloumns) {
        for (int i = 0; i < nums.length; i++) {
            nums[i][coloumns]++;
            

        }
     
    }
}
```
