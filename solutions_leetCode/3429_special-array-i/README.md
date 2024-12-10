# Special Array I

**Question ID**: 3429  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 43 MB  

## Solution Code
```java
// https://leetcode.com/problems/special-array-i

class Solution {
    public boolean isArraySpecial(int[] nums) {
        
        for(int i=1;i<nums.length;i++){
            int a=nums[i-1]%2;
            int b=nums[i]%2;
            
            if(a==b)
                return false;
            
        }
        return true;
    }
}
```
