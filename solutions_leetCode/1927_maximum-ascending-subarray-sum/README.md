# Maximum Ascending Subarray Sum

**Question ID**: 1927  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 40.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/maximum-ascending-subarray-sum

class Solution {
    public int maxAscendingSum(int[] nums) {

        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[i-1])
                sum+=nums[i];
            else{
                max=Math.max(max,sum);
                sum=nums[i];
            }
        }
        return Math.max(max,sum);
        // return sum;
        
    }
}
```
