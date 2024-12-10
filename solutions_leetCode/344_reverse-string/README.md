# Reverse String

**Question ID**: 344  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 49 MB  

## Solution Code
```java
// https://leetcode.com/problems/reverse-string

class Solution {
    public void reverseString(char[] s) {
        char ch='a';
        int start=0;
        while(start<s.length/2){
            ch=s[start];
            s[start]=s[s.length-1-start];
            s[s.length-1-start]=ch;
            start++;
    }
    }
}
```
