# Intersection Of Two Arrays

**Question ID**: 349  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 6 ms  
**Memory**: 42.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/intersection-of-two-arrays

class Solution {
     public  int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> inter = new ArrayList<>();
        for (int a : nums1) {
            if (search(a, nums2) && !inter.contains(a))
                inter.add(a);

        }
        int[] arr = inter.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public  boolean search(int target, int[] a) {
        for (int i : a) {
            if (target == i)
                return true;
        }
        return false;

    }
}
```
