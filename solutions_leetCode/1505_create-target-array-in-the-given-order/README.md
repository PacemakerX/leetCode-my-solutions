# Create Target Array In The Given Order

**Question ID**: 1505  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/create-target-array-in-the-given-order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
            ArrayList<Integer> ls = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            ls.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ls.get(i);

        }
        return nums;
    }
}
```
