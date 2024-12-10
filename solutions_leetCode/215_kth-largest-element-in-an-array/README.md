# Kth Largest Element In An Array

**Question ID**: 215  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 22 ms  
**Memory**: 57.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/kth-largest-element-in-an-array

class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

   
        return nums[nums.length-k];
        
    }
}
```
