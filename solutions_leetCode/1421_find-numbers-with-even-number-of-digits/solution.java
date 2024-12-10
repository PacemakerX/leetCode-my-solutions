import java.util.*;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] nums) {
         int countEven = 0;
        for (int i : nums) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 0)
                countEven++;
        }
        return countEven;

    }

}