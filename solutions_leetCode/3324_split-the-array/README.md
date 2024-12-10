# Split The Array

**Question ID**: 3324  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 42.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/split-the-array

class Solution {
    public boolean isPossibleToSplit(int[] nums) {

     int [] ans = new int [101];

     for(int i : nums)
        ans[i]++;

    for(int i : ans)
        if(i>2)
            return false;
    return true;
    }
}
```
