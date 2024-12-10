import java.util.*;
// https://leetcode.com/problems/assign-cookies

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=g.length-1,j=s.length-1,count=0;
        while(i>=0 &&j>=0){
            if(s[j]>=g[i]){
            count++;
            i--;
            j--;
            }
            else
            i--;
        }
        return count;
    }
}