# Find Pivot Index

**Question ID**: 724  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 45.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-pivot-index

class Solution {
    public int pivotIndex(int[] nums) {

        int[] prefix= new int[nums.length];
        int[] postfix= new int[nums.length];

        int prefixSum=0,postfixSum=0;

        for(int i=nums.length-1;i>=0;i--){
            postfix[i]=postfixSum;
            
            postfixSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            prefix[i]=prefixSum;
            if(postfix[i]==prefix[i])
            return i;
            prefixSum+=nums[i];
        }

        return -1;
    }
}
```
