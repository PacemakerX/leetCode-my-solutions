# Kids With The Greatest Number Of Candies

**Question ID**: 1528  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 42.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
      List<Boolean> ls = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            ls.add(isGreatest(candies, i));
            candies[i] -= extraCandies;

        }
        return ls;

    }

    public static Boolean isGreatest(int[] nums, int i) {
        int index = i;
        for (int j = 0; j < nums.length; j++) {
            if ( j!=i && nums[j] > nums[index])
                index = j;

        }
        return (index == i);
    }
}
```
