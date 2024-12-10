import java.util.*;
// https://leetcode.com/problems/third-maximum-number

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        List<Integer> list = new ArrayList();
        for(int n : nums)
            if(!list.contains(n))
                list.add(n);

        if(list.size()<3)
            return list.get(list.size()-1);
        else
            return list.get(list.size()-3);

    }
}