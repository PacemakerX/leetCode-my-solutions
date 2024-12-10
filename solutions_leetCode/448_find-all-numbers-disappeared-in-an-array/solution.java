import java.util.*;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

class Solution {
    public  List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List <Integer> list = new LinkedList<Integer>();
        while (i < nums.length) {
            if (nums[i]-1 != i && nums[i]!=nums[nums[i]-1]) {
                swap(nums, nums[i]-1, i);
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]-1)
                list.add(j+1);
        }
        return list;
    }

    public  void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}