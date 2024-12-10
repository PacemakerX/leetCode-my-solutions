import java.util.*;
// https://leetcode.com/problems/height-checker

class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        int count=0;
        
        for (int i=0;i<heights.length;i++)
            if(heights [i]!=arr[i])
                count++;
            
        return count;
    }
}