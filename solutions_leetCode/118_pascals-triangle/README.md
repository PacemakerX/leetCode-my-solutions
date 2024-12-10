# Pascals Triangle

**Question ID**: 118  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 42 MB  

## Solution Code
```java
// https://leetcode.com/problems/pascals-triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
         List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            // if(i==0)
            ls.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {

                if(j-1==-1 || j==ls.get(i-1).size())
                ls.get(i).add(1);
                else
                ls.get(i).add(ls.get(i-1).get(j-1)+ls.get(i-1).get(j));
            }

        }
            return ls;
    }
}
```
