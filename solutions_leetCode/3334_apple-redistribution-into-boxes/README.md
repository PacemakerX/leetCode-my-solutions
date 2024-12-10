# Apple Redistribution Into Boxes

**Question ID**: 3334  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 42.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/apple-redistribution-into-boxes

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = Arrays.stream(apple).sum();
        int ans = 0;
        
        for(int i = capacity.length-1;i>=0;i--){
            
            ans++;
            sum-=capacity[i];
            if(sum <= 0)    break;
        }
        return ans;
    }
}
```
