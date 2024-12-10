import java.util.*;
// https://leetcode.com/problems/length-of-last-word

class Solution {
    public int lengthOfLastWord(String s) {
         s=s.trim();
        if(s.lastIndexOf(" ")!=-1)
        return (s.substring(s.lastIndexOf(" ")+1, s.length()).length());
        else
        return s.length();
    }
}