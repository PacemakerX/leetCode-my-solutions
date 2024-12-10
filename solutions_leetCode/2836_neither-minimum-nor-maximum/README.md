# Neither Minimum Nor Maximum

**Question ID**: 2836  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 45 MB  

## Solution Code
```java
// https://leetcode.com/problems/neither-minimum-nor-maximum

class Solution {
    public int findNonMinOrMax(int[] nums) {

        if(nums.length<=2)
            return -1;
    
        int min =Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i : nums)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
        }

        for(int i: nums){
            if(i>min && i<max)
                return i;
        }

        return -1;
    }
}
```
