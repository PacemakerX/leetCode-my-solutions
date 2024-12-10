import java.util.*;
// https://leetcode.com/problems/score-of-a-string

class Solution {
    public int scoreOfString(String s) {
        
        int score=0;
        
        for(int i=1;i<s.length();i++){
            score+= Math.abs((s.charAt(i)-'0')-(s.charAt(i-1)-'0'));
        }
        return score;
    }
}