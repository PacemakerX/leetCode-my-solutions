# Monotonic Array

**Question ID**: 932  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 55 MB  

## Solution Code
```java
// https://leetcode.com/problems/monotonic-array

class Solution {
    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    public boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] > A[i+1]) return false;
        return true;
    }

    public boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] < A[i+1]) return false;
        return true;
    }

}
```
