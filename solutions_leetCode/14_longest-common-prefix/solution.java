import java.util.*;
// https://leetcode.com/problems/longest-common-prefix

class Solution {
     public  String longestCommonPrefix(String[] strs) {
       String comm = "";

        for (int i = 0; i < strs[0].length(); i++) {
            int count=0;

            for (int j = 1; j < strs.length && i<strs[j].length(); j++) {
                if (strs[0].charAt(i) == (strs[j].charAt(i)))
                    count++;

            }
            if (count == strs.length - 1)
                comm += strs[0].charAt(i);
            else
                return comm;
        }
        return comm;
    }
}