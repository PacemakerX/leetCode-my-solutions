# Maximum Average Subarray I

**Question ID**: 643  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 5 ms  
**Memory**: 55.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/maximum-average-subarray-i

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        double maxAvgWindow = sum/k;

        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            maxAvgWindow = Math.max(maxAvgWindow, sum/k);
        }

        return maxAvgWindow;
    }
}
```
