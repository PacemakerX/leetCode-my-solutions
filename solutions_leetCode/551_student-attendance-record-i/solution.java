import java.util.*;
// https://leetcode.com/problems/student-attendance-record-i

class Solution {
    public boolean checkRecord(final String s) {
        int absent = 0, late = 0;

        for(int i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);

            if(c == 'A') {
                absent++;
                late = 0;
            } else if(c == 'L') {
                late++;
            } else {
                late = 0;
            }

            if(absent > 1 || late > 2)
                return false;
        }

        return true;
    }
}