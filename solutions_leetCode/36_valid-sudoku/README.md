# Valid Sudoku

**Question ID**: 36  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 43.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/valid-sudoku

class Solution {
      public  boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (!(checkColoumn(board, board[i][j], i, j) && checkBox(board, board[i][j], i, j)&& checkRow(board,board[i][j], i, j)))
                        return false;

                }

            }
        }
        return true;
    }

    public  boolean checkColoumn(char[][] board, char ch, int row, int coloumn) {
        for (int i = 0; i < board.length; i++) {
            if (i != row && board[i][coloumn] == ch)
                return false;

        }
        return true;
    }
     public  boolean checkRow(char[][] board, char ch, int row, int coloumn) {
        for (int i = 0; i < board[0].length; i++) {
            if (i != coloumn && board[row][i] == ch)
                return false;

        }
        return true;
    }

    public  boolean checkBox(char[][] board, char ch, int row, int coloumn) {
        for (int i = ((row / 3) * 3); i < ((row / 3 + 1) * 3); i++) {
            for (int j = ((coloumn / 3) * 3); j < ((coloumn / 3 + 1) * 3); j++) {

                if (i != row && j != coloumn && board[i][j] == ch)
                    return false;
            }

        }
        return true;
    }
}
```
