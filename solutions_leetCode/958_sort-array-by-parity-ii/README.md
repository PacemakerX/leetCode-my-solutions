# Sort Array By Parity Ii

**Question ID**: 958  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 46.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/sort-array-by-parity-ii

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int[] odd= new int[nums.length/2];
        int[] even= new int[nums.length/2];
        
        int i=0,j=0;
        for(int n : nums){
            if(n%2==0)
                even[i++]=n;
            else
                odd[j++]=n;
        }
        
        i=0;
        j=0;
        
        for(int k=0;k<nums.length;k++){
            if(k%2==0)
                nums[k]=even[i++];
            else
                nums[k]=odd[j++];
        }
     
return nums;
        
    }
}
```
