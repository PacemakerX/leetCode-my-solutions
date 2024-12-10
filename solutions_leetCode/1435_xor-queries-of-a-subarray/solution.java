import java.util.*;
// https://leetcode.com/problems/xor-queries-of-a-subarray

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for (int i = 1; i < arr.length; i++) 
            arr[i] = arr[i] ^ arr[i-1];
        
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            if (query[0] == 0) ans[i] = arr[query[1]];
            else ans[i] = arr[query[1]] ^ arr[query[0] - 1];
        }
        return ans;
    }
}