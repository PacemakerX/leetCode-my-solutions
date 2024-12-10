# Find The Integer Added To Array I

**Question ID**: 3397  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 42.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-the-integer-added-to-array-i

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        return nums2[0]-nums1[0];

        
    }
}
```
