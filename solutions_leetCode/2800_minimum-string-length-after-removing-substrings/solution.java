import java.util.*;
// https://leetcode.com/problems/minimum-string-length-after-removing-substrings

class Solution {
    public int minLength(String s) {

        StringBuilder str= new StringBuilder(s);

        while(s.contains("AB") || s.contains("CD")){
            if(s.contains("AB"))
                str.delete(str.indexOf("AB"),str.indexOf("AB")+2);

            if(s.contains("CD"))
                str.delete(str.indexOf("CD"),str.indexOf("CD")+2);
            
            s=str.toString();
        }
        
        return s.length();
    }
}