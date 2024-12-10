import java.util.*;
// https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count=0,sum=0;;
        for (int i = 1; i <=n; i++) {
            if(check(banned, i)){
                if((sum+i)<=maxSum){
                    sum+=i;
                    count++;
                }
            }
            
        }
        return count;
    }
    public boolean check(int [] nums,int target){
        for (int i : nums) {
            if(i==target)
            return false;
        }
        return  true;
    }
}