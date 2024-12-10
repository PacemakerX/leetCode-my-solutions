import java.util.*;
// https://leetcode.com/problems/type-of-triangle

class Solution {
    public String triangleType(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();
        
        if(!isTriangle(nums[0],nums[1],nums[2]))
            return "none";
        
        set.add(nums[0]);
        set.add(nums[1]);
        set.add(nums[2]);

        if(set.size()==1)
            return "equilateral";
        else if(set.size()==2)
            return "isosceles";
        else
            return "scalene";
        
    }


    public boolean isTriangle(int a,int b,int c){

        if((a+b>c) && (a+c>b) && (c+b>a))
            return true;
        
        return false;
    }
}