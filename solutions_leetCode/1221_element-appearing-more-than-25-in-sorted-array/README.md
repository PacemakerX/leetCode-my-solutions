# Element Appearing More Than 25 In Sorted Array

**Question ID**: 1221  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 43.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array

import java.util.*;
class Solution {
    public int findSpecialInteger(int[] arr) {
              int prev = arr[0];
        int count = 1;
        if (arr.length == 1)
            return arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prev) {
                count++;
                if (count > (arr.length / 4))
                    return arr[i];
            } else
                count = 1;

            prev = arr[i];

        }
        return -1;
    }
}
```