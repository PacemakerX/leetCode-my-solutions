import java.util.*;
// https://leetcode.com/problems/subarray-sum-equals-k

class Solution {
    public int subarraySum(int[] nums, int k) {

         int n = nums.length; // size of the given numsay.
        Map<Integer,Integer> mpp = new HashMap();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {

            preSum += nums[i];

            int remove = preSum - k;

            cnt += mpp.getOrDefault(remove, 0);


            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
}}