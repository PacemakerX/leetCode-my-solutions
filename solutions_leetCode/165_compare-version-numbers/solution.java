import java.util.*;
// https://leetcode.com/problems/compare-version-numbers

class Solution {
    public int compareVersion(String version1, String version2) {

          
        int count1 = 0, count2 = 0;
        for (int i = 0; i < version1.length(); i++) {
            if (version1.charAt(i) == '.')
                count1++;
        }

        for (int i = 0; i < version2.length(); i++) {
            if (version2.charAt(i) == '.')
                count2++;
        }
        if (count1 < count2)
            version1 = equaliseVersion(version1, count2 - count1);
        else if (count2 < count1)
            version2 = equaliseVersion(version2, count1 - count2);
        StringBuilder str1 = new StringBuilder(version1);
        StringBuilder str2 = new StringBuilder(version2);

        int max = Math.max(count1, count2);

        while (max >=0) {
            if (Integer.parseInt(str1.substring(0, str1.indexOf(".")==-1?str1.length():str1.indexOf("."))) < Integer
                    .parseInt(str2.substring(0, str2.indexOf(".")==-1?str2.length():str2.indexOf("."))))
                return -1;
            else if (Integer.parseInt(str1.substring(0, str1.indexOf(".")==-1?str1.length():str1.indexOf("."))) > Integer
                    .parseInt(str2.substring(0, str2.indexOf(".")==-1?str2.length():str2.indexOf("."))))
                return 1;
            else {
                str1.delete(0, str1.indexOf(".")+1);
                str2.delete(0, str2.indexOf(".")+1);

            }
            max--;
        }
        return 0;
        

    }

    public String equaliseVersion(String str,int k){
        while(k>0){
            str+=".0";
            k--;
        }

        return str;
    }

}