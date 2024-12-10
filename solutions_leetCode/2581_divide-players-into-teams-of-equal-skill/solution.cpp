#include <bits/stdc++.h>
using namespace std;
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