#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length

class Solution {
public:

    struct monotone {
        deque<char> dq;

        int maxSize=0;

        void insert(char ch){
            dq.push_back(ch);
        }
        void remove(char ch){
            if(dq.front()==ch)
                dq.pop_front();
        }

    void maxLength()
    {
        if (dq.size() > maxSize)
            maxSize = dq.size();
    }
    };

    bool checkVowel(char ch){
        if(ch =='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
            return true;

        return false;
    }
    int maxVowels(string s, int k) {
        
        monotone mp;

        for(int i=0;i<s.length();i++){

            char ch=s[i];
            if(checkVowel(ch)){

                mp.insert(ch);
            }    
                if((i-k)>=0)
                    mp.remove(s[i-k]);
                if((i-k)>=-1)
                    mp.maxLength();
        }

        return mp.maxSize;
    }
};