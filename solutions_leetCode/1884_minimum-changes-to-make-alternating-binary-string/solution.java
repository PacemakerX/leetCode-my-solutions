import java.util.*;
// https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string

class Solution {
    public int minOperations(String s) {
       int count01 = 0, count10 = 0;
        for (int i = 0; i < s.length(); i+=2) {
            if (s.charAt(i) == '0')
                count01++;
            if (i+1 <s.length() && s.charAt(i + 1) == '1')
                count01++;
        }
        for (int i = 0; i < s.length(); i+=2) {
            if (s.charAt(i) == '1')
                count10++;
            if (i+1 <s.length()&&s.charAt(i + 1) == '0')
                count10++;
        }
        return Math.min(count01, count10);
    }
}