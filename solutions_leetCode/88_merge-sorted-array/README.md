# Merge Sorted Array

**Question ID**: 88  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 40.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/merge-sorted-array

class Solution {
       public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = nums1.length - 1;
        while (j >= 0) {
            if (i>=0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
       }
}
```
