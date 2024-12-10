# Keep Multiplying Found Values By Two

**Question ID**: 2274  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 43.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/keep-multiplying-found-values-by-two

class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==original ){

             return findFinalValue(nums,original*2);
            }
        }
        return original;
    }
}
```
