# Set Mismatch

**Question ID**: 645  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 45.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/set-mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        
    int i = 0;
        int[] arr = new int[2];
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1] ) {
                swap(nums, nums[i]-1, i);
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]-1) {
                arr[0] = nums[j];
                arr[1] = j + 1;
                break;
            }
        }
        return arr;
    }

    public static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
```
