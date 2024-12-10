# Construct The Rectangle

**Question ID**: 492  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 215 ms  
**Memory**: 40.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/construct-the-rectangle

class Solution {
    public int[] constructRectangle(int area) {
         int[] param = { Integer.MAX_VALUE/2, Integer.MIN_VALUE/2 };
        if(area ==1){
            param[0]=1;
            param [1]=1;
            return param;
        }
        for (int i = 1; i <= area / 2; i++) {
            if (area % i == 0) {
                if (param[0] - param[1] >= Math.abs(i - area / i)) {
                    param[0] = i >= area / i ? i : area / i;
                    param[1] = area / param[0];
                }
            }

        }
        return param;
    }
}
```
