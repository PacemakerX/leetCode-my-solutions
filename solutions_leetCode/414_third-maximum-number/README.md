# Third Maximum Number

**Question ID**: 414  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 285 ms  
**Memory**: 44.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/third-maximum-number

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        List<Integer> list = new ArrayList();
        for(int n : nums)
            if(!list.contains(n))
                list.add(n);

        if(list.size()<3)
            return list.get(list.size()-1);
        else
            return list.get(list.size()-3);

    }
}
```
