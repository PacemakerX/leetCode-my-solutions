import java.util.*;
// https://leetcode.com/problems/flipping-an-image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int temp = 0;
        int len = image.length;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length / 2; j++) {
                temp = image[i][j];
                image[i][j] = image[i][len - 1 - j];
                image[i][len - 1 - j] = temp;
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length ; j++) {
               image[i][j] = (1 ^ image[i][j]);
            }
        }
        return image;
    }
}