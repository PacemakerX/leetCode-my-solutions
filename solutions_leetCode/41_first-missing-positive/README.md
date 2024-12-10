# First Missing Positive

**Question ID**: 41  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 54.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/first-missing-positive

class Solution {
    public int firstMissingPositive(int[] nums) {
       int i = 0;
        while (i < nums.length) {
            if ( nums[i] <= nums.length && nums[i] > 0 && nums[nums[i] - 1] != nums[i] ) {
                swap(nums, nums[i] - 1, i); 
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1)
                return j + 1;
        }
        return nums.length + 1;
    }

    public static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
```
