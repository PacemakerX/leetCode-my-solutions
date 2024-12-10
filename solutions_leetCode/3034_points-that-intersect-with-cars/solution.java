import java.util.*;
// https://leetcode.com/problems/points-that-intersect-with-cars

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        int count=0;
        int[][] intervals = new int[nums.size()][2];
        
        for(int i=0;i<intervals.length;i++){
            intervals[i][0]=nums.get(i).get(0);
            intervals[i][1]=nums.get(i).get(1);
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        nums.clear();
        
        
        for(int i =0;i<intervals.length;i++){

          if(nums.isEmpty() || nums.get(nums.size()-1).get(1)<intervals[i][0]){

                nums.add(Arrays.asList(intervals[i][0],intervals[i][1]));
          }
          else
            nums.get(nums.size()-1).set(1,Math.max(nums.get(nums.size()-1).get(1),intervals[i][1]));
    
        }

        for(int i =0;i<nums.size();i++)
            count+=(nums.get(i).get(1)-nums.get(i).get(0)+1);

        return count;
    }
}