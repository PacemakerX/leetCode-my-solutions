import java.util.*;
// https://leetcode.com/problems/count-elements-with-maximum-frequency

class Solution {
    public int maxFrequencyElements(int[] nums) {
          int[] freq = new int[101];
        for (int n : nums)
            freq[n]++;

        int max = 0, count = 0;

        for (int k : freq) {

            if (k != 0)
                max=Math.max(max, k);

        }

        for (int j : freq) {

            if (j == max)
                count+=j;
        }
        return count;
        
    }
}