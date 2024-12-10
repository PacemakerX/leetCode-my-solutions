import java.util.*;
// https://leetcode.com/problems/sign-of-the-product-of-an-array

class Solution {
    public int arraySign(int[] nums) {

       int sign=1;

        for(int n: nums){
            if(n==0)
                return 0;
            else if(n<0)
               sign*=-1;
        }
        
        return sign;
    }
}