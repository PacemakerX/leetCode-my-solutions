# Rearrange Array Elements By Sign

**Question ID**: 2271  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 76.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/rearrange-array-elements-by-sign

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
         int[] newNums= new int[nums.length];
        
        int eveNums=0,oddNums=1;
        for (int i : nums) {
            if(i>0){
                newNums[eveNums]=i;
                eveNums+=2;

            }
            else{
                newNums[oddNums]=i;
                oddNums+=2;
            }
        }
        return newNums;
    }
}
```
