# Check If The Sentence Is Pangram

**Question ID**: 1960  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/check-if-the-sentence-is-pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i = 97; i < 123; i++) {
            if (sentence.indexOf((char) i) == -1)
                return false;

        }
        return true; 
    }
}
```
