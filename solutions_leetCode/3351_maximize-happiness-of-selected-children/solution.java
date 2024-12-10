import java.util.*;
// https://leetcode.com/problems/maximize-happiness-of-selected-children

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);
        
        int i=happiness.length-1;
        long sum=0;
        int n=0;
        while(n<k){
            
            if(happiness[i]-n>0)
                sum+= happiness[i]-n;
            
             i--;
            n++;
        }
        return sum;
        
    }
}