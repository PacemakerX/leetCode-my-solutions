# Find The N Th Value After K Seconds

**Question ID**: 3422  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 428 ms  
**Memory**: 8.1 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/find-the-n-th-value-after-k-seconds

class Solution {
public:
    #define mod 1000000007
    int valueAfterKSeconds(int n, int k) {
        
        long long arr[n];
        
        fill(arr,arr+n,1);
        
        while(k--){
            for(int i=1;i<n;i++){
                arr[i]= ((arr[i-1]%mod)+(arr[i]%mod))%mod;
            }
        }
        return arr[n-1];
        
    }
};
```
