# String Compression

**Question ID**: 443  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 13.8 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/string-compression

class Solution {
#include <vector>

public:
    int compress(vector<char>& chars) {
        
        chars.push_back(' ');
        char ch=chars[0];
        int count=1;
        int i=1;
        
        while(i<chars.size()){


            if(chars[i]==ch){
                count++;
                chars.erase(chars.begin()+i);

            }else{
                
if(count>1){
    
string str=to_string(count);
                  for(auto c : str){
                      
                  chars.insert(chars.begin()+i,c);
                      i++;
                  }
}

                ch=chars[i];
                count=1;
               i++;
                                 
        }}
chars.pop_back();
return chars.size();
        
    }
};
```
