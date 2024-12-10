# Lucky Numbers In A Matrix

**Question ID**: 1496  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 45.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/lucky-numbers-in-a-matrix

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
    List<Integer> ls = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int[] is : matrix) {
            for (int i = 0; i < is.length; i++) {
                if (is[i] < min) {
                    index = i;
                    min = is[i];
                }
            }
             if (min == checkMax(matrix, index))
                ls.add(min);
            min = Integer.MAX_VALUE;
        }
        return ls;
        
    }

    public  int checkMax(int[][]matrix, int coloumn){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            max=Math.max(max, matrix[i][coloumn]);
        }
        return max;
    }
}
```
