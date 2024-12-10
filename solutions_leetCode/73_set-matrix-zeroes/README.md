# Set Matrix Zeroes

**Question ID**: 73  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 45.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/set-matrix-zeroes

class Solution {
        public void setZeroes(int[][] matrix) {
            
               int[] row = new int[200];
        int[] column = new int[200];
        int k = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[k] = i;
                    column[k] = j;
                    k++;
                }

            }

        }
        k = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0 && (row[k] == i && column[k] == j)) {
                    setRowZero(matrix, i);
                    setColumnZero(matrix, j);
                    k++;
                }

            }

        }
    }

    public  void setRowZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;

        }
    }

    public  void setColumnZero(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;

        }
    }
}
```
