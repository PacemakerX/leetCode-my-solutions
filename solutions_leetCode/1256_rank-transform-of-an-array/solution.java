import java.util.*;
// https://leetcode.com/problems/rank-transform-of-an-array

class Solution {
        public int[] arrayRankTransform(int[] arr) {

 HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }

        Arrays.sort(ans);
        int count=1;
        for(int i=0;i<ans.length;i++){
            if(!map.containsKey(ans[i]))
                map.put(ans[i],count++);
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;
        }
}