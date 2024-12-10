# Missing Number

**Question ID**: 268  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 44.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/missing-number

class Solution {
   public int missingNumber(int[] nums) {
        int i = 0;
        while (i<nums.length ) {
            if (nums[i] != i && nums[i]!=nums.length) {
                swap(nums, nums[i], i);
            }
            else
            i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(j!=nums[j])
            return j;
        }
        return nums.length;
    }
    private void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
```
