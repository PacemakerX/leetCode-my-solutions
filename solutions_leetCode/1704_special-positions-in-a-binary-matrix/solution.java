import java.util.*;
// https://leetcode.com/problems/special-positions-in-a-binary-matrix

class Solution {
   
    public  int numSpecial(int[][] mat) {
        int count = 0, countl = 0, index = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {

                    count++;
                    index = j;
                }
            }
            if (count == 1 && check(mat, i, index))
                countl++;
            count = 0;
        }
        return countl;
    }

    public  boolean check(int[][] mat, int i, int j) {
        for (int k = 0; k < mat.length; k++) {
            if (i != k && mat[k][j] == 1)
                return false;
        }
        return true;
    }
}