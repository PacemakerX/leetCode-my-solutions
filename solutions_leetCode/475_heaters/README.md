# Heaters

**Question ID**: 475  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 16 ms  
**Memory**: 46.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/heaters

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ans = 0;
        for(int ele : houses){
            int lo = 0, hi = heaters.length - 1;
            int justSmaller = -1, justLarger = -1;
            while(lo <= hi){
                int mid = (lo + hi) / 2;
                if(heaters[mid] == ele){
                    justSmaller = heaters[mid];
                    justLarger = heaters[mid];
                    break;
                }
                else if(heaters[mid] < ele){
                    justSmaller = heaters[mid];
                    lo = mid + 1;
                }
                else{
                    justLarger = heaters[mid];
                    hi = mid - 1;
                }
            }
            justSmaller = justSmaller == -1 ? Integer.MAX_VALUE : ele - justSmaller;
            justLarger = justLarger == -1 ? Integer.MAX_VALUE : justLarger - ele;
            ans = Math.max(ans, Math.min(justSmaller, justLarger));
        }
        return ans;
    }
}
```
