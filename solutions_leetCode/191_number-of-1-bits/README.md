# Number Of 1 Bits

**Question ID**: 191  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 40.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/number-of-1-bits

class Solution {
    public int hammingWeight(int n) {

        int count=0;

        while(n>0){
            count+=n&1;
            n=n>>1;
        }
        
        return count;
    }
}
```
