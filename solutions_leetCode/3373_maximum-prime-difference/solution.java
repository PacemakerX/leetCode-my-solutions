import java.util.*;
// https://leetcode.com/problems/maximum-prime-difference

class Solution {
    public int maximumPrimeDifference(int[] nums) {
        
        int start=0,end=nums.length-1;
        
    
            while(!checkPrime(nums[start])){
                    start++;
                  }
            while(!checkPrime(nums[end])){
                    end--;
            }
                  
            return(end-start);
        
    }
    
    public boolean checkPrime(int a){
        if(a==1)
            return false;
        for(int i =2;i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
}