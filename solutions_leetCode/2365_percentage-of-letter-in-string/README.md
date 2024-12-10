# Percentage Of Letter In String

**Question ID**: 2365  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/percentage-of-letter-in-string

class Solution {
    public int percentageLetter(String s, char letter) {

        double count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter)
                count++;
        }       

        return (int) ((count/s.length())*100);
    }
}
```
