# Boats To Save People

**Question ID**: 917  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 16 ms  
**Memory**: 54.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/boats-to-save-people

class Solution {
    public int numRescueBoats(int[] people, int limit) {

           
        int boat=0;
        int cap=0;
        int i=0,j=people.length-1;
        Arrays.sort(people);
        while( i<=j){
            cap=people[i]+people[j];
            if(cap<=limit){
                boat++;
                i++; 
                j--;
            }else{
                boat++;
                j--;
            }
        
            }
            return boat;
    }
}
```
