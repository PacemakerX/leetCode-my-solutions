import java.util.*;
// https://leetcode.com/problems/reshape-the-matrix

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

         if (mat.length * mat[0].length != r * c)
            return mat;

        int[][] ans = new int[r][c];
        int p = 0,q = 0;
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {

                if (q == ans[0].length) {
                    q = 0;
                    p++;
                }
                ans[p][q++] = mat[i][j];

            }
        }
        return ans;
    }
}