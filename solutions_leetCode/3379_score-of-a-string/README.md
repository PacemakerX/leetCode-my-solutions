# Score Of A String

**Question ID**: 3379  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 41.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/score-of-a-string

class Solution {
    public int scoreOfString(String s) {
        
        int score=0;
        
        for(int i=1;i<s.length();i++){
            score+= Math.abs((s.charAt(i)-'0')-(s.charAt(i-1)-'0'));
        }
        return score;
    }
}
```
