# Check If N And Its Double Exist

**Question ID**: 1468  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 15.1 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/check-if-n-and-its-double-exist

class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        

        map<int,int> nMap;

        for(int i=0;i<arr.size();i++){
            nMap[arr[i]]=i;

        }

        for(int i=0;i<arr.size();i++){

            if(nMap.find(arr[i]*2)!=nMap.end() && nMap[arr[i]*2]!=i){
                return true;
            }

        }

        return false;
    }
};
```
