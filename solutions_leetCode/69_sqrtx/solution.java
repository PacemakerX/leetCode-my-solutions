import java.util.*;
// https://leetcode.com/problems/sqrtx

class Solution {
   public  int mySqrt(int x) {
 

        int start = 0, end = x , mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (check(mid, x))
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }

    public  boolean check(int target, int x) {
        return (long)target * target <= x;
    }
}