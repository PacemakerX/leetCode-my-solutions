# Truncate Sentence

**Question ID**: 1944  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 42.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/truncate-sentence

class Solution {
    public String truncateSentence(String s, int k) {
        if(k==0){
            return new String("");
        }
        StringBuilder sb = new StringBuilder("");
        String strArray[] = s.split(" ");
        for(int i=0;i<k;i++){
            sb.append(strArray[i]+" ");
        }
        return sb.toString().trim();
    }
}
```
