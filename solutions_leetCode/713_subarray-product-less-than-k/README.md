# Subarray Product Less Than K

**Question ID**: 713  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 47.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/subarray-product-less-than-k

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int cnt = 0;
        int pro = 1;
        for (int i = 0, j = 0; j < nums.length; j++) {
            pro *= nums[j];
            while (i <= j && pro >= k) {
                pro /= nums[i++];
            }
            cnt += j - i + 1;
        }
        return cnt;        
    }
}
```
