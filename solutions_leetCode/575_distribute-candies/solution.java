import java.util.*;
// https://leetcode.com/problems/distribute-candies

class Solution {
    public int distributeCandies(int[] candyType) {

        HashSet<Integer> map = new HashSet<Integer>();
        for(int i : candyType)
            map.add(i);

        if(candyType.length/2>map.size())
            return map.size();
        else
        return candyType.length/2;
        
    }
}