# Find The Index Of The First Occurrence In A String

**Question ID**: 28  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 40.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle))
            return 0;
        for (int j = 0; j <= (haystack.length() - needle.length()); j++) {
            if ((haystack.substring(j, j + needle.length())).equals(needle))
                return j;
        }
        return -1;
    }
}
```
