# Number Of Strings That Appear As Substrings In Word

**Question ID**: 2099  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 42.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word

class Solution {
    public int numOfStrings(String[] patterns, String word) {
           int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i]))
                count++;
        }
        return count;
    }
}
```
