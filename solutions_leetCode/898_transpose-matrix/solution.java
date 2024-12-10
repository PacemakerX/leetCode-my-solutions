import java.util.*;
// https://leetcode.com/problems/transpose-matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
         int[][] Tmatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Tmatrix[j][i] = matrix[i][j];
            }

        }
        return Tmatrix;
    } 
    }