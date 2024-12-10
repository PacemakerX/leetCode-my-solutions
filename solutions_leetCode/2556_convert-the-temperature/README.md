# Convert The Temperature

**Question ID**: 2556  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/convert-the-temperature

class Solution {
    public double[] convertTemperature(double celsius) {

    return new double[] {celsius+273.15,celsius * 1.80 + 32.00};     
    }
}
```
