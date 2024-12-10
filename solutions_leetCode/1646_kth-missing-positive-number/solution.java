import java.util.*;
// https://leetcode.com/problems/kth-missing-positive-number

class Solution {
    public int findKthPositive(int[] arr, int k) {

      int index = 0;
        int expected = 0;

        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= arr[arr.length - 1] + k; i++) {
            if (index < arr.length) {
                if (i != arr[index]) {
                    ls.add(i);
                    expected++;
                } else
                    index++;
            } else{
                ls.add(i);
                expected++;
            }
            if(expected==k)
            return ls.getLast();
        }
        return -1;
        
    }
}