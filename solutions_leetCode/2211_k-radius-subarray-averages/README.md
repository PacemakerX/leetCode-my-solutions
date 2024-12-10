# K Radius Subarray Averages

**Question ID**: 2211  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 7 ms  
**Memory**: 65 MB  

## Solution Code
```java
// https://leetcode.com/problems/k-radius-subarray-averages

class Solution {
    public int[] getAverages(int[] nums, int k) {

        int i=0;

        
        int[] ans = new int[nums.length];

        Arrays.fill(ans,-1);
            if(nums.length<(2*k+1))
            return ans;

        long sum=0;
        
        while( i<2*k+1){
            sum+=nums[i];
            i++;
        }
        i=0;
        int l=k;
        ans[l++]=(int)(sum/(2*k+1)); 

        for(int j=2*k+1;j<nums.length;j++){

            sum= sum-nums[i]+nums[j];
            ans[l]=(int)(sum/(2*k+1));
            i++;
            l++;
        }

        return ans;
    }
}
```
