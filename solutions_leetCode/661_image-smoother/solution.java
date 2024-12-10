import java.util.*;
// https://leetcode.com/problems/image-smoother

class Solution {
    public  int[][] imageSmoother(int[][] img) {
        int[][] roundedImg = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                roundedImg[i][j] = getAverage(img, i, j);

            }
        }
        return roundedImg;
    }

    public  int getAverage(int[][] img, int row, int coloumn) {
        int sum = 0, count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            if (i < 0 || i >= img.length)
                continue;
            for (int j = coloumn - 1; j <= coloumn + 1; j++) {
                if (j < 0 || j >= img[0].length)
                    continue;
                sum += img[i][j];
                count++;
            }

        }
        return Math.floorDiv(sum, count);
    }
}