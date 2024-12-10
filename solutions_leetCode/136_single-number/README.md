# Single Number

**Question ID**: 136  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 46.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
        int xor=nums[0];

        for(int n =1;n<nums.length;n++)
        xor=nums[n]^xor;

        return xor;
        
    }
}
```
