# Remove Duplicates From Sorted Array Ii

**Question ID**: 80  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 44 MB  

## Solution Code
```java
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0;
        for(int ele: nums ){
            
            if(i==0 || i== 1 || nums[i-2]!=ele)
nums[i++]=ele;



        }
        return i;
    }
}
```
