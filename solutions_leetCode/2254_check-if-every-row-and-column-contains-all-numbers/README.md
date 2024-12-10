# Check If Every Row And Column Contains All Numbers

**Question ID**: 2254  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 50 ms  
**Memory**: 44.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers

class Solution {
   public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(!(checkColoumn(matrix,matrix[i][j], i, j) && checkRow(matrix, matrix[i][j], i, j) ))
                return false;
            }
        }
        return true;
    }
    public boolean checkColoumn(int[][] board, int ch, int row, int coloumn) {
        for (int i = 0; i < board.length; i++) {
            if (i != row && board[i][coloumn] == ch)
                return false;

        }
        return true;
    }

    public boolean checkRow(int[][] board, int ch, int row, int coloumn) {
        for (int i = 0; i < board[0].length; i++) {
            if (i != coloumn && board[row][i] == ch)
                return false;

        }
        return true;
}
}
```
