# Minimum Number Game

**Question ID**: 3226  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 44.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/minimum-number-game

class Solution {
    public int[] numberGame(int[] nums) {
        
        Arrays.sort(nums);
        int temp=0;
        
        for(int i=1;i<nums.length;i+=2){
            temp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
        }

    
    return nums;
}}
```
