# Ant On The Boundary

**Question ID**: 3311  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 42.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/ant-on-the-boundary

class Solution {
    public int returnToBoundaryCount(int[] nums) {

        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }

        int count=0;
        for(int i : nums)
            if(i==0)
                count++;

        return count;
    }
}
```
