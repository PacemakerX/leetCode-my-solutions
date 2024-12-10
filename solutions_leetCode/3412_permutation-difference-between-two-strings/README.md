# Permutation Difference Between Two Strings

**Question ID**: 3412  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 42.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/permutation-difference-between-two-strings

class Solution {
    public int findPermutationDifference(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0;i<t.length();i++)
            map.put(t.charAt(i),i);

        int sum=0;

        for(int i=0;i<s.length();i++)
            sum+=Math.abs(i-map.get(s.charAt(i)));

        return sum;
    }
}
```
