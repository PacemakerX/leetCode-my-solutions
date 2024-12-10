# Minimum Length Of String After Deleting Similar Ends

**Question ID**: 1850  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 45 MB  

## Solution Code
```java
// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends

class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char current = s.charAt(left);
            while (left <= right && s.charAt(left) == current) {
                left++;
            }
            while (right >= left && s.charAt(right) == current) {
                right--;
            }
        }
        
        return right - left + 1;
    }
}
```
