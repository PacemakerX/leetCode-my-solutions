# Range Sum Of Sorted Subarray Sums

**Question ID**: 1615  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 73 ms  
**Memory**: 46.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/range-sum-of-sorted-subarray-sums

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {



        int[] ans = new int[n * (n + 1) / 2];

        int k = 0;

        for (int i = 0; i < n; i++) {
            int sum = nums[i];
            ans[k++] = sum;
            for (int j = i + 1; j < n; j++) {
                sum += nums[j];
                ans[k++] = sum;
            }
        }

        Arrays.sort(ans);

        // int sumleft=ans[0];
        for (k = 1; k < right; k++)
            ans[k] = (ans[k] + ans[k - 1])% (int)(Math.pow(10,9)+7);

            if(left>=2)
        return ans[right - 1] - ans[left - 2];
        else
            return ans[right-1];
}}
```
