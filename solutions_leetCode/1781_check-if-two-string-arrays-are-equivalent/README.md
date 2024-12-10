# Check If Two String Arrays Are Equivalent

**Question ID**: 1781  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         return getString(word1).equals(getString(word2));

    }

    public  String getString(String[] arr) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);

        }
        return str.toString();
    }
}
```
