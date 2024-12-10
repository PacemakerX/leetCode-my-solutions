# Check If Array Is Sorted And Rotated

**Question ID**: 1878  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 41 MB  

## Solution Code
```java
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated

class Solution {
    public boolean check(int[] nums) {
        if(nums.length==1)
        return true;

          int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        Arrays.sort(nums2);
        int k = 0;
        int temp = 0;
        while (k < nums.length) {
            temp=nums2[0];
            for (int i = nums.length - 1; i > 0; i--) {
                nums2[(i + 1) % nums.length] = nums2[i];
            }
            nums2[1] = temp;
            if (match(nums, nums2))
                return true;
            k++;
        }
        return false;
    }

    public static boolean match(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i])
                return false;
        }
        return true;
    }
}
```
