import java.util.*;
// https://leetcode.com/problems/maximum-score-after-splitting-a-string

class Solution {
      public int maxScore(String s) {
        int max = -1;
        for (int i = 1; i < s.length(); i++) {
            int score = getScore(s, i);
            if (max < score)
                max = score;
        }
        return max;

    }

    public int getScore(String str, int i) {
          int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (j < i) {
                if (str.charAt(j) == '0')
                    count++;
            } else if ((str.charAt(j) == '1'))
                count++;

        }
        return count;
    }
}