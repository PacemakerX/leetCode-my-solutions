# Height Checker

**Question ID**: 1137  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 41.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/height-checker

class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        int count=0;
        
        for (int i=0;i<heights.length;i++)
            if(heights [i]!=arr[i])
                count++;
            
        return count;
    }
}
```
