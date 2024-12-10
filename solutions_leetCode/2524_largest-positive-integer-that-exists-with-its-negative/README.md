# Largest Positive Integer That Exists With Its Negative

**Question ID**: 2524  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 8 ms  
**Memory**: 44.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative

class Solution {
    public int findMaxK(int[] nums) {
      int max=-1;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        for(int n: nums){
            if(n<0)
                set.add(n);
            else if(set.contains(n*-1)){
                    max=Math.max(max,n);
                }
            }
        
return max;
    }}
```
