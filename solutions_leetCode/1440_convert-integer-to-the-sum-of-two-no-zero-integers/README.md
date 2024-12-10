# Convert Integer To The Sum Of Two No Zero Integers

**Question ID**: 1440  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 41.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers

class Solution {
    public int[] getNoZeroIntegers(int n) {

        for(int i=1;i<n;i++){
            int req=n-i;
            if(!String.valueOf(i).contains("0") && !String.valueOf(req).contains("0") )
                return new int[] {i,req};
        }
     return null;   
    }
}
```
