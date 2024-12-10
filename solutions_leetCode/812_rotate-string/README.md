# Rotate String

**Question ID**: 812  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 41.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/rotate-string

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        int count=1;
        StringBuilder str = new StringBuilder(s);
        while(count<=s.length()){
            str.append(str.charAt(0));
            str.deleteCharAt(0);
            if((str.toString()).equals(goal))
            return true;
            count++;
        }
        return false;
        
    }
}
```