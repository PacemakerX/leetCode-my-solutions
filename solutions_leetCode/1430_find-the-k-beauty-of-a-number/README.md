# Find The K Beauty Of A Number

**Question ID**: 1430  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 40.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-the-k-beauty-of-a-number

class Solution {
    public int divisorSubstrings(int num, int k) {

        String str = ""+num;
        int count=0;

        for(int i=k;i<=str.length();i++){
            int n= Integer.parseInt(str.substring(i-k,i));

            if(n==0)
                continue;
            else if(num%n==0)
                count++;
        }
        return count;
        
    }
}
```
