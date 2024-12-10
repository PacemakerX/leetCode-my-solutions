# Distribute Elements Into Two Arrays I

**Question ID**: 3347  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 44.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/distribute-elements-into-two-arrays-i

class Solution {
    public int[] resultArray(int[] nums) {
        
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        
        ls1.add(nums[0]);
        ls2.add(nums[1]);
        
        int i=2;
        int n=2;
        while(n<=nums.length && i<nums.length){
            
            if(ls1.get(ls1.size()-1) >ls2.get(ls2.size()-1))
                ls1.add(nums[i]);
            else
                ls2.add(nums[i]);
            i++;
            n++;
        }
        ls1.addAll(ls2);
        for(int j=0;j<nums.length;j++){
            nums[j]=ls1.get(j);
        }
        
        return nums;
    }
}
```
