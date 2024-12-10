import java.util.*;
// https://leetcode.com/problems/delete-columns-to-make-sorted

class Solution {
    public int minDeletionSize(String[] strs) {

        int m=strs[0].length(),n=strs.length,columns=0;

        int prev=0;
        for(int i=0;i<m;i++){
            
            prev=(int)strs[0].charAt(i);

            for(int j=1;j<n;j++){
                
                if(prev>(int)strs[j].charAt(i)){
                    columns++;
                    break;
                }
                else
                    prev=(int)strs[j].charAt(i);
            }
        }
        
        return columns;
    }
}