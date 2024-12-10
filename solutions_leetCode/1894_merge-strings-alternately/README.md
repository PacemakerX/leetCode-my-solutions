# Merge Strings Alternately

**Question ID**: 1894  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 41.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/merge-strings-alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {
          int l1 = 0, l2 = 0;
        StringBuilder str = new StringBuilder();
        while (l1 < word1.length() && l2 < word2.length()) {
            str.append(word1.charAt(l1));
            l1++;

            str.append(word2.charAt(l2));
            l2++;

        }
        while (l1 < word1.length()) {
            str.append(word1.charAt(l1));
            l1++;
        }
        while (l2 < word2.length()) {
            str.append(word2.charAt(l2));
            l2++;
        }
        return str.toString();
    }
}
```
