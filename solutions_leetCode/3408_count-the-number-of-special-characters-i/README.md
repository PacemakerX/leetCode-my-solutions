# Count The Number Of Special Characters I

**Question ID**: 3408  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 8 ms  
**Memory**: 42.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/count-the-number-of-special-characters-i

class Solution {
    public int numberOfSpecialChars(String word) {
        
        String str="";
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<word.length();i++){
            if((int)word.charAt(i)>=97 && (int)word.charAt(i)<=122)
                str+=word.charAt(i);
        }
        
        for(int i=0;i<str.length();i++){
            
            for(int j=0;j<word.length();j++){
                if(Math.abs((int)str.charAt(i)-(int)word.charAt(j))==32)
                    set.add(str.charAt(i));
            }
            
        }
        
        return set.size();
        
    }
}
```
