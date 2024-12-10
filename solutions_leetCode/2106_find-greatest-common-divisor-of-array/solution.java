import java.util.*;
// https://leetcode.com/problems/find-greatest-common-divisor-of-array

class Solution {
    public int findGCD(int[] nums) {
        
        int min=1001,max=0;

        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }

        return calculate(min,max);
    }

    int calculate(int a,int b){
        if(b==0)
            return a;
        else
            return calculate(b,a%b);
    }
}