import java.util.*;
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero

class Solution {
    public int[] sumZero(int n) {

        int[] ans = new int[n];

        List<Integer> list = new ArrayList();

        if(n%2==1){
            list.add(0);
            n--;
        }
        for(int i=1;i<n;i++){
            list.add(i);
            list.add(-i);
        }

        for(int i=0;i<ans.length;i++)
            ans[i]=list.get(i);
        
        return ans;
    }
}