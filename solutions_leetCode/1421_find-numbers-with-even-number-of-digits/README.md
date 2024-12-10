# Find Numbers With Even Number Of Digits

**Question ID**: 1421  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 42.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] nums) {
         int countEven = 0;
        for (int i : nums) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 0)
                countEven++;
        }
        return countEven;

    }

}
```
