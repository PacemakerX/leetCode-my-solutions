# Maximum Subarray

**Question ID**: 53  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 57.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {

        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            max=Math.max(sum,max);

            if(sum<0)
            sum=0;
            
        }
        return max;

        
    }
}
```
