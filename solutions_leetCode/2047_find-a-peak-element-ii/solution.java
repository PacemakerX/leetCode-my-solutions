import java.util.*;
// https://leetcode.com/problems/find-a-peak-element-ii

class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, lo = 0, hi = m - 1, mid; 
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            int max_row = 0;
            for (int i = 0; i < n; ++i) {
                if (matrix[max_row][mid] < matrix[i][mid])
                    max_row = i;
            }
            if ((mid == 0 || matrix[max_row][mid] > matrix[max_row][mid - 1]) && 
                (mid == m - 1 || matrix[max_row][mid] > matrix[max_row][mid + 1]))
                return new int[] {max_row, mid};
            else if (mid > 0 && matrix[max_row][mid - 1] > matrix[max_row][mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return new int[] {-1, -1};
    }
}