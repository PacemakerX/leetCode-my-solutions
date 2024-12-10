import java.util.*;
// https://leetcode.com/problems/valid-mountain-array

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        int max = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        if(index==0 || index ==arr.length-1) return false;
        return isIncreasing(arr, index) && isDecreasing(arr, index);
    }

    public static boolean isIncreasing(int arr[], int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i + 1] <= arr[i])
                return false;
        }
        return true;
    }
     public static boolean isDecreasing(int arr[], int index) {
        for (int i = index; i < arr.length-1; ++i) {
            if (arr[i + 1] >= arr[i])
                return false;
        }
        return true;
    }
}