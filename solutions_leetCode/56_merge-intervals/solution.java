import java.util.*;
// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {

         Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        
        List<List<Integer>> ls = new ArrayList<>();
        for(int i =0;i<intervals.length;i++){

          if(ls.isEmpty() || ls.get(ls.size()-1).get(1)<intervals[i][0]){

                ls.add(Arrays.asList(intervals[i][0],intervals[i][1]));
          }
          else
            ls.get(ls.size()-1).set(1,Math.max(ls.get(ls.size()-1).get(1),intervals[i][1]));
    
        }

        int ans[][]= new int[ls.size()][2];

        for(int i=0;i<ans.length;i++){
            ans[i][0]=ls.get(i).get(0);
            ans[i][1]=ls.get(i).get(1);
        }

        return ans;
    }
}