# Shuffle String

**Question ID**: 1651  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 44.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/shuffle-string

class Solution {
    
    public String restoreString(String s, int[] indices) {
        
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++) 
            result[indices[i]] = s.charAt(i);
        
        return new String(result);
    }
}
```
