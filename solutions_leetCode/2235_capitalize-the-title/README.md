# Capitalize The Title

**Question ID**: 2235  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 7.9 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/capitalize-the-title

class Solution {
public:
    string capitalizeTitle(string title)
{
    string ans = "";
    string word = "";
    for (auto i : title)
    {

        if (i != ' ')

            word += i;

        else
        {
            transform(word.begin(), word.end(), word.begin(), ::tolower);
            if (word.length() > 2)
                word[0] = word[0]-'a' + 'A';
            ans += word;
            ans += i;
            word = "";
        }
    }
    transform(word.begin(), word.end(), word.begin(), ::tolower);
            if (word.length() > 2)
                word[0] = word[0]-'a' + 'A';
            ans += word;
    return ans;
}

};
```
