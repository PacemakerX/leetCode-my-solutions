# Valid Parentheses

**Question ID**: 20  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 42.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
          if(s.length()%2==1)
        return false;
        StringBuilder str = new StringBuilder(s);
        int i=0;
        while(i<str.length()-1){
            if((str.substring(i, i+2).equals("()") || str.substring(i, i+2).equals("{}") || str.substring(i, i+2).equals("[]"))){

                str.delete(i, i+2);
                if(str.length()==0)
                return true;
                if(i!=0)
                i--;
            }
            else i++;
        }
        return false;
    }
}
```
