#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/uncommon-words-from-two-sentences

class Solution {
public:
void parse(string &str, unordered_map<string, int> &count)
{

    string word = "";
    for (auto i : str)
    {

        if (i != ' ')

            word += i;

        else
        {
            count[word]++;

            word = "";
        }
    }
}
    vector<string> uncommonFromSentences(string s1, string s2) {
            unordered_map<string, int> count1;
    unordered_map<string, int> count2;

    string word = "";
    s2 += " ";
    s1 += " ";
    parse(s1, count1);
    parse(s2, count2);

    vector<string> arr;
    for (auto i : count1)
    {
        if (count1[i.first] == 1 && count2[i.first] == 0)
            arr.push_back(i.first);
    }
    for (auto i : count2)
    {
        if (count2[i.first] == 1 && count1[i.first] == 0)
            arr.push_back(i.first);
    }
     return arr;   
    }
};