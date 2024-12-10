#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal

class Solution {
public:
    int minChanges(int n, int k) {
        // Step 1: Check if it's possible to convert n to k
        if ((n & k) != k) {
            return -1;
        }
        
        int res = 0;
        
        string n_bin = bitset<32>(n).to_string();
        string k_bin = bitset<32>(k).to_string();
        
        for (char c : n_bin) {
            res += c - '0';
        }
        
        for (char c : k_bin) {
            res -= c - '0';
        }

        return res;
    }
};