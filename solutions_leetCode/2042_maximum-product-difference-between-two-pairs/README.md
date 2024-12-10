# Maximum Product Difference Between Two Pairs

**Question ID**: 2042  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 44.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs

class Solution {
    public int maxProductDifference(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max1 < nums[i]) {
                max2 = max1;
                max1 = nums[i];
            } else if (max2 <= nums[i])
                max2 = nums[i];
            if (min1 > nums[i]) {
                min2 = min1;
                min1 = nums[i];
            } else if (min2 >= nums[i])
                min2 = nums[i];

        }
        return ((max1 * max2) - (min1 * min2));
    }
}
```
