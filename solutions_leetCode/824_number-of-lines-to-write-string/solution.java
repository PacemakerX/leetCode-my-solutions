import java.util.*;
// https://leetcode.com/problems/number-of-lines-to-write-string

class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int lines=1,pixels=0;

        for(int i=0;i<s.length();i++){

            if(pixels+widths[(int)s.charAt(i)-97]>100){
                lines++;
                pixels=widths[(int)s.charAt(i)-97];
            }
            else
                pixels+=widths[(int)s.charAt(i)-97];
        }
        int [] ans = {lines,pixels};

        return ans;
    }
}