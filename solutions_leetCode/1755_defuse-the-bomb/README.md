# Defuse The Bomb

**Question ID**: 1755  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 42 MB  

## Solution Code
```java
// https://leetcode.com/problems/defuse-the-bomb

class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        int n = code.length;
        if(k > 0){
            int sum = 0;
            int i = 1;
            int window = k;
            while(window>0){
                sum += code[i];
                i =(i+1)%n ;
                window--;
            }

            ans[0] = sum;

            for(int j = 1; j<n; j++){
                sum = sum - code[j] + code[i];
                i = (i+1)%n;
                ans[j] = sum;
            }
        }else if(k<0){
            int sum = 0;
            int i = n-1;
            int window = -k;
            while(window>0){
                sum += code[i];
                i--;
                window--;
            }

            ans[0] = sum;

            for(int j = 1; j<n; j++){
                i = (i+1)%n; //to protect overflow
                sum = sum + code[j-1] - code[i];
                ans[j] = sum;
            }
        }
        return ans; 
    }
}
```
