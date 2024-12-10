# Search Insert Position

**Question ID**: 35  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 43.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/search-insert-position

class Solution {
      public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
        int mid = low + (high - low) / 2;
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                low = mid + 1;
            else if (target < nums[mid])
                high = mid - 1;
        }
       return low;
    }
}
```
