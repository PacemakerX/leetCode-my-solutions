# Divide Players Into Teams Of Equal Skill

**Question ID**: 2581  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 54 ms  
**Memory**: 56.4 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/divide-players-into-teams-of-equal-skill

class Solution {
public:
    long long dividePlayers(vector<int>& skill) {
        

        sort(skill.begin(),skill.end());

        int low=0,high=skill.size()-1;

        long long skillSum=skill[low]+skill[high];
        long long chemistry=0;

        while(low<high){

            if(skill[low]+skill[high]==skillSum){
                chemistry+=skill[low]*skill[high];

                low++;
                high--;
            }
            else
                return -1;
        }

        return chemistry;
    }
};
```
