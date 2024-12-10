# Two Sum

**Question ID**: 1  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 47 ms  
**Memory**: 44.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                return new int[] {i,j}; 
            }
        }
        return new int[] {-1,-1};
    }
}
```
