import java.util.*;
// https://leetcode.com/problems/search-a-2d-matrix-ii

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(target<matrix[0][0] || target>matrix[matrix.length-1][matrix[0].length-1])
        return false;

        int i=matrix.length-1,j =0;

        while(i>=00 && j <matrix[0].length){

            if(matrix[i][j]==target)
            return true;
            else if(matrix[i][j]>target)
            i--;
            else
            j++;
        }
        return false;
        
    }
}