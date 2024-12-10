import java.util.*;
// https://leetcode.com/problems/search-a-2d-matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
int startI = 0, endI = matrix.length - 1, startJ = 0, endJ = matrix[0].length - 1;
        int midI = 0, midJ = 0;

        while (startI <= endI && startJ <= endJ) {
            midI = startI + (endI - startI) / 2;
            midJ = startJ + (endJ - startJ) / 2;

            if (matrix[midI][midJ] == target)
                return true;
            else if (matrix[midI][midJ] > target) {
                if (matrix[midI][0] > target)
                    endI = midI - 1;
                else
                    endJ = midJ - 1;

            } else if (matrix[midI][midJ] < target) {
                if (matrix[midI][matrix[midI].length - 1] < target)
                    startI = midI + 1;
                else
                    startJ = midJ + 1;

            }
        }
        return false;

    }
}