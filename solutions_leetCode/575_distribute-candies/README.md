# Distribute Candies

**Question ID**: 575  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 34 ms  
**Memory**: 45.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/distribute-candies

class Solution {
    public int distributeCandies(int[] candyType) {

        HashSet<Integer> map = new HashSet<Integer>();
        for(int i : candyType)
            map.add(i);

        if(candyType.length/2>map.size())
            return map.size();
        else
        return candyType.length/2;
        
    }
}
```
