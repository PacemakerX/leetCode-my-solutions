# Convert An Array Into A 2d Array With Conditions

**Question ID**: 2724  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 7 ms  
**Memory**: 44.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int i =0;i<nums.length;i++)
        ls.add(nums[i]);
        int i=0,j=0;
        while(!ls.isEmpty()){
            mainList.add(new ArrayList<Integer>());
            j=0;
            while(j<ls.size()){
                if(!mainList.get(i).contains(ls.get(j))){
                    mainList.get(i).add(ls.get(j));
                    ls.remove(j);
                }
                else
                j++;
            }
            i++;
        }
        return mainList;
    }
}
```
