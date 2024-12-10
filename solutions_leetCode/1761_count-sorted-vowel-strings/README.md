# Count Sorted Vowel Strings

**Question ID**: 1761  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 39.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/count-sorted-vowel-strings

class Solution {
    public int countVowelStrings(int n) {
        int a = 1;
        int e = 1;
        int i = 1;
        int o = 1;
        int u = 1;
        while (n-- > 1) {
            a = a + e + i + o + u;
            e = e + i + o + u;
            i = i + o + u;
            o = o + u;
        }
        return a + e + i + o + u;
    }
}
```
