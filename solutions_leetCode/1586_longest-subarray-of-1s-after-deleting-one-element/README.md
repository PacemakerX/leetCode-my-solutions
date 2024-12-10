# Longest Subarray Of 1s After Deleting One Element

**Question ID**: 1586  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 57 MB  

## Solution Code
```java
// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element

class Solution {
    public int longestSubarray(int[] nums) {

        int max=Integer.MIN_VALUE;
        int count=0,prev1=0;
        boolean check=true;

        for(int n : nums){
            
            if(n==0){
                check=false;
                max=Math.max(max,prev1+count);
                prev1=count;
                count=0;
                
            }
            else
                count++;
        }
        max=Math.max(max,prev1+count);

        return check==true?max-1:max;
    }
}
```