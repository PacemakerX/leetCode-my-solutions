# Minimum Number Of Operations To Make Array Empty

**Question ID**: 3094  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 13 ms  
**Memory**: 61 MB  

## Solution Code
```java
// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty

class Solution {
    public int minOperations(int[] nums) {
         int count=0;
         Arrays.sort(nums);
        int[] num2 = new int[nums[nums.length-1]+1];
        for (int i = 0; i < nums.length; i++) {
            num2[nums[i]]++;

        }
        for (int i = 0; i < num2.length; i++) {
            if(num2[i]!=0){
                if(num2[i]==1) 
                return -1;
                else if(num2[i]%3==0)
                count+=num2[i]/3;
                else 
                count+=num2[i]/3+1;
            }
        }
        return count;
    }
}
```
