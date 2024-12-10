# Circular Sentence

**Question ID**: 2580  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 10 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/circular-sentence

class Solution {
public:
bool isCircularSentence(string sentence)
{

    sentence += " ";

    int pre = 0;

    vector<string> arr;

    for (int i = 0; i < sentence.size(); i++)
    {
        if (sentence[i] == ' ')
        {
            string s = sentence.substr(pre, i - pre );
            arr.push_back(s);
            pre = i + 1;
        }
    }


    int n = arr.size();
    for (int i = 0; i < n; i++)
    {

        if (arr[i][arr[i].size() - 1] != arr[(i + 1) % n][0])
            return false;
    }

    return true;
}
};
```
