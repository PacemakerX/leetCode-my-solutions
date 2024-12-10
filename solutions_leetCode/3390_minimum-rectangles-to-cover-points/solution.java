import java.util.*;
// https://leetcode.com/problems/minimum-rectangles-to-cover-points

class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        
        
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int i = 0;

        int start = 0;
        int count = 0;

        while (i < points.length) {
            start = points[i][0];

            while (i < points.length && points[i][0] <= start + w) {
                i++;
            }
            count++;
        }
        return count;
    }
}