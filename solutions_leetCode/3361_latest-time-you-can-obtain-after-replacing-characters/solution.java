import java.util.*;
// https://leetcode.com/problems/latest-time-you-can-obtain-after-replacing-characters

class Solution {
    public String findLatestTime(String s) {
        
        StringBuilder str= new StringBuilder(s);
        
        if(str.charAt(0)=='?')
            str.setCharAt(0,(str.charAt(1)=='0'||str.charAt(1)=='1'|| str.charAt(1)=='?')?'1':'0');
        if(str.charAt(1)=='?'){
            str.setCharAt(1,(str.charAt(0)=='0')?'9':'1');
        }
        if (str.charAt(3)=='?')
            str.setCharAt(3,'5');
        if (str.charAt(4)=='?')
            str.setCharAt(4,'9');
        
        return str.toString();
    }
}