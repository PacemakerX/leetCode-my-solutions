import java.util.*;
// https://leetcode.com/problems/last-visited-integers

class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {

        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int k=0;
        for(int n : nums){
            
            if(n>0){
                seen.add(0,n);
                k=0;
            }
            else{
                k++;
                if(k<=seen.size())
                    ans.add(seen.get(k-1));
                else
                    ans.add(-1);
            }
        }
        return ans;
    }
}