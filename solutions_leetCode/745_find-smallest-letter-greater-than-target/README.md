# Find Smallest Letter Greater Than Target

**Question ID**: 745  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 44.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-smallest-letter-greater-than-target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int start=0;
      int end=letters.length-1;
       while(start<=end){
           int mid=start +(end-start)/2;

           if (target<letters[mid])
           end=mid-1;
           else
           start=mid+1;
           

       }
       return letters[start%letters.length];
}
}
```
