# Reverse Prefix Of Word

**Question ID**: 2128  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/reverse-prefix-of-word

class Solution {
    public String reversePrefix(String word, char ch) {
           if(word.indexOf(ch)==-1)
        return word;
        int i = word.indexOf(ch);
        StringBuilder str = new StringBuilder(word.substring(0, i+1));
        str.reverse();
        str.append(word.substring(i+1, word.length()));
        return str.toString();

    }
}
```
