import java.util.*;
// https://leetcode.com/problems/find-beautiful-indices-in-the-given-array-i

class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        
          List<Integer> ls = new ArrayList<>();

        for (int i = 0; i <= s.length() - a.length(); i++) {

            if ((s.substring(i, (i + a.length() - 1) + 1)).equals(a)) {
                for (int j = i-k<0?0:i-k; j <= (s.length() - b.length()<i+k?s.length() - b.length():i+k); j++) {
                    if (s.substring(j, (j + b.length() - 1) + 1).equals(b) && Math.abs(j - i) <= k) {
                        ls.add(i);
                        break;
                    }

                }
            }

        }
        return ls;
        
    }
}