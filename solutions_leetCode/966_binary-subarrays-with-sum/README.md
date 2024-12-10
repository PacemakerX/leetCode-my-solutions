# Binary Subarrays With Sum

**Question ID**: 966  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 21 ms  
**Memory**: 49.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/binary-subarrays-with-sum

class Solution {

    public int numSubarraysWithSum(int[] nums, int goal) {



        HashMap<Integer,Integer> map = new HashMap<>();



        int sum=0;

        int count=0,req=0;

        map.put(0,1);

        for(int i=0;i<nums.length;i++){



            sum+=nums[i];

            req=sum-goal;



            

                count+=map.getOrDefault(req,0);



            map.put(sum,map.getOrDefault(sum,0)+1);

        }

    

    return count;

}}
```
