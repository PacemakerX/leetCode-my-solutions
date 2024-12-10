# Count Number Of Nice Subarrays

**Question ID**: 1370  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 44 ms  
**Memory**: 55.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/count-number-of-nice-subarrays

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap <Integer,Integer> map = new HashMap<>();
        int numOfSubArrays=0;
        map.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]%2==1)
                count++;

            if(map.containsKey(count-k)){
                numOfSubArrays+=map.get(count-k);
                // map.put(count,map.getOrDefault(count-k,0)+1);
            }
            // else
                map.put(count,map.getOrDefault(count,0)+1);
            
        }

     return numOfSubArrays;  
    }
}
```
