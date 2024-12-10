# Majority Element

**Question ID**: 169  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 50.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/majority-element

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
```
