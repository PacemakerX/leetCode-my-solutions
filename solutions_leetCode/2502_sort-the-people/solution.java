import java.util.*;
// https://leetcode.com/problems/sort-the-people

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            boolean swapped = false;

            for (int j = 1; j < heights.length - i; j++) {
                if (heights[j] > heights[j - 1]) {
                    int temp = heights[j - 1];
                    heights[j - 1] = heights[j];
                    heights[j] = temp;
                    String temp2 = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = temp2;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return names;
    }
}