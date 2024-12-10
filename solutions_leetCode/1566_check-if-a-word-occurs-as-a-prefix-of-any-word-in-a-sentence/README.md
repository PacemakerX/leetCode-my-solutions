# Check If A Word Occurs As A Prefix Of Any Word In A Sentence

**Question ID**: 1566  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 8.2 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence

class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {


        vector<string> arr;

        int start=0;
        for(int i=0;i<sentence.size();i++){

            if(sentence[i]==' '){

                string str= sentence.substr(start,i-start+1);
                arr.push_back(str);

                start=i+1;
            }
        }


         string str= sentence.substr(start,str.size()-start-1);
         arr.push_back(str);


        int ind=-1;
        for(int i=0;i<arr.size();i++){
            string str=arr[i];
            if(str.find(searchWord)==0 ){
                ind=i;
                break;
            }


        }
        
        return ind==-1?ind:ind+1;
    }
};
```
