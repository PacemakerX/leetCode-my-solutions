# Maximum Product Subarray

**Question ID**: 152  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 44.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        
          int n = nums.length; //size of array.

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= nums[i];
            suff *= nums[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;


    }
}
```
