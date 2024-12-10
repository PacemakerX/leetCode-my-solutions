import java.util.*;
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days

class Solution {
   public  int shipWithinDays(int[] weights, int days) {

        int max = 0;
        for (int i = 0; i < weights.length; i++) {
            max +=  weights[i];
        }
        
        int start = 0, end = max, mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (numOfDays(weights, days, mid))
                end = mid - 1;
            else
                start = mid + 1;
        }

        return start;

    }

    public  boolean numOfDays(int[] weights, int days, int target) {
        int noOfDays = 0;
        int weight = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] + weight <= target)
                weight += weights[i];
            else if (weights[i] > target)
                return false;
            else {
                noOfDays++;
                weight = weights[i];
            }
        }
        noOfDays += weight == 0 ? 0 : 1;
        return noOfDays <= days;
    }

}