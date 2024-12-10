# Find Target Indices After Sorting Array

**Question ID**: 2210  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 43.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-target-indices-after-sorting-array

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> m=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                m.add(i);
            }
        }
        return m;
    }
}
```
