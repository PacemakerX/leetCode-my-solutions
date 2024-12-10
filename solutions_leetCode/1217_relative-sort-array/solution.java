import java.util.*;
// https://leetcode.com/problems/relative-sort-array

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int max = -1;
        for (int i : arr1) {
            max = Math.max(max, i);

        }
        int[] fre = new int[max + 1];
        for (int i : arr1) {
            fre[i]++;

        }
        int i = 0;
        for (int j = 0; j < arr2.length; j++) {
            while (fre[arr2[j]] > 0) {
                arr1[i] = arr2[j];
                fre[arr2[j]]--;
                i++;
            }

        }
        for (int k = 0; k < fre.length; k++) {
            while(fre[k] != 0) {
                arr1[i] = k;
                i++;
                fre[k]--;

            }

        }
        return arr1;

    }
}