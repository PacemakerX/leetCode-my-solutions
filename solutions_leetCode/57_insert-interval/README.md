# Insert Interval

**Question ID**: 57  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 44.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/insert-interval

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals.length==0){
            return new int[][] {{newInterval[0],newInterval[1]}};
        }
          int pos = -1;

        for (int i = 0; i < intervals.length; i++) {

            if (intervals[i][0] > newInterval[0]) {
                pos = i;
                break;
            }
        }

        if (pos == -1)
            pos = intervals.length;

        List<List<Integer>> ls = new ArrayList<>();
        int n = 0;

        while (n < intervals.length) {

            if (n < pos) {
                ls.add(Arrays.asList(intervals[n][0], intervals[n][1]));
            } else if (n == pos) {

                if (ls.isEmpty() || ls.get(ls.size() - 1).get(1) < newInterval[0])
                    ls.add(Arrays.asList(newInterval[0], newInterval[1]));
                else
                    ls.get(ls.size() - 1).set(1, Math.max(ls.get(ls.size() - 1).get(1), newInterval[1]));

                    if (ls.get(ls.size() - 1).get(1) < intervals[pos][0])
                    ls.add(Arrays.asList(intervals[pos][0], intervals[pos][1]));
                else
                    ls.get(ls.size() - 1).set(1, Math.max(ls.get(ls.size() - 1).get(1), intervals[pos][1]));
            } else if (n > pos) {

                if (ls.get(ls.size() - 1).get(1) < intervals[n][0])
                    ls.add(Arrays.asList(intervals[n][0], intervals[n][1]));
                else
                    ls.get(ls.size() - 1).set(1, Math.max(ls.get(ls.size() - 1).get(1), intervals[n][1]));
                
            }
            n++;
        }
        if(pos==intervals.length){
                if (ls.isEmpty() || ls.get(ls.size() - 1).get(1) < newInterval[0])
                    ls.add(Arrays.asList(newInterval[0], newInterval[1]));
                else
                    ls.get(ls.size() - 1).set(1, Math.max(ls.get(ls.size() - 1).get(1), newInterval[1]));
}

        int ans[][] = new int[ls.size()][2];

        for (int i = 0; i < ls.size(); i++) {
            ans[i][0] = ls.get(i).get(0);
            ans[i][1] = ls.get(i).get(1);
        }
        return ans;
    
    }
}
```
