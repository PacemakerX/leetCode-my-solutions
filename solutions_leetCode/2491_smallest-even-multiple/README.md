# Smallest Even Multiple

**Question ID**: 2491  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 40.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/smallest-even-multiple

class Solution {
    public int smallestEvenMultiple(int n) {


        return (2*n)/findGcd(2,n);
    }

    int findGcd(int a,int b){
        if(b==0)
            return a;
        else
        return findGcd(b,a%b);
    }
}
```
