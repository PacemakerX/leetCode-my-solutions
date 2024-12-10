# Minimize String Length

**Question ID**: 2825  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 8 ms  
**Memory**: 45.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/minimize-string-length

class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character>hs = new HashSet<>();
        for (char c : s.toCharArray()) {
            hs.add(c);
        }
        return hs.size();
        
    }
}
```
