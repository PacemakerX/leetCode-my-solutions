# Maximum Product Of Two Elements In An Array

**Question ID**: 1574  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array

class Solution {
    public int maxProduct(int[] nums) {
   int max = 0;
        int max2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max2 = max;
                max = nums[i];
            } else if (max2 < nums[i]) {
                max2 = nums[i];
            }
        }
        return (max - 1) * (max2 - 1);
    }
}
```