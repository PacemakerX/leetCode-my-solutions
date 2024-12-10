# Zigzag Conversion

**Question ID**: 6  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 6 ms  
**Memory**: 44.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/zigzag-conversion

class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        StringBuffer [] arr = new StringBuffer[numRows]; 
        for(int i=0; i<numRows; i++) arr[i] = new StringBuffer();

        int i=0;
        while(i<n){
            /// verticaly downword
            for(int ind=0; ind<numRows && i<n; ind++){
                arr[ind].append(s.charAt(i++));
            }
            /// bent upword
            for(int ind=numRows-2; ind>0 && i<n; ind--){
                arr[ind].append(s.charAt(i++));
            }
        }
        StringBuffer ans = new StringBuffer();
        for(StringBuffer el : arr){
            ans.append(el);
        }
        return ans.toString();
    }
}
```
