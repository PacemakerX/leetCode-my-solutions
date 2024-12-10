# Build Array From Permutation

**Question ID**: 2048  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 45.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/build-array-from-permutation

class Solution {
    public int[] buildArray(int[] nums) {
    
    int[] ans = new int[nums.length];

    for(int i=0;i<nums.length;i++)
        ans[i]=nums[nums[i]];
    return ans;
}}
```
