# N Repeated Element In Size 2n Array

**Question ID**: 1001  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 45.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array

class Solution {
    public int repeatedNTimes(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return nums[i];
    }
}
```
