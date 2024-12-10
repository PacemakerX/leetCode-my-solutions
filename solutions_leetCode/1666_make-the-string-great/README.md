# Make The String Great

**Question ID**: 1666  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 41.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/make-the-string-great

class Solution {
    public String makeGood(String s) {

        StringBuilder str = new StringBuilder(s);

        int i=0;

        while(i<=str.length()-2){
            if(Math.abs((str.charAt(i)-'0')-(str.charAt(i+1)-'0'))==32){
                str.delete(i,i+2);
                i=0;
            }
            else
            i++;
        }       
        return str.toString();
    }
}
```
