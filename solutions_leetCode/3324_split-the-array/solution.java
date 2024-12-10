import java.util.*;
// https://leetcode.com/problems/split-the-array

class Solution {
    public boolean isPossibleToSplit(int[] nums) {

     int [] ans = new int [101];

     for(int i : nums)
        ans[i]++;

    for(int i : ans)
        if(i>2)
            return false;
    return true;
    }
}