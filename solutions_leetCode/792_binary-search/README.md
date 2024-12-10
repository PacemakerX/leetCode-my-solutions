# Binary Search

**Question ID**: 792  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 44.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/binary-search

class Solution {
    public int search(int[] nums, int target) {
          int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid])
                return mid;
            else if (target < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;

        }
        return -1;
    }
}
```
