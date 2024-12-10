# Maximum Odd Binary Number

**Question ID**: 3055  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 42.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/maximum-odd-binary-number

class Solution {
    public String maximumOddBinaryNumber(String s) {


        int numOfOne=0;
        int numOfZero=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                numOfOne++;
            else
                numOfZero++;
        }
        
        StringBuilder str = new StringBuilder();
         str.append('1');
         numOfOne--;

         while(numOfZero>0){
            str.append('0');
            numOfZero--;
         }
        while(numOfOne>0){
            str.append('1');
        numOfOne--;
        }

        return str.reverse().toString();
    }
}
```
