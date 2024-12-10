import java.util.*;
// https://leetcode.com/problems/first-bad-version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first=1;
        int last =n;
        int mid=0;
        while(first<last){
            mid=first+(last-first)/2;
            if(isBadVersion(mid))
            last=mid;
            else
            first=mid+1;
        }
       return first; 


    }
}