import java.util.*;
// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int n=0;
        int count=0;
        long sum=0;
        while(n<k){
            sum+=arr[n];
            n++;
        }
        
        if(sum/k>=threshold)
            count++;
        
        for(int i=k;i<arr.length;i++){
           sum=sum-arr[i-k]+arr[i];
            
            if(sum/k>=threshold)
            count++;
        }

        return count;
    }
}