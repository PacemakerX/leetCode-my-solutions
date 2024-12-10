#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/rectangle-area

class Solution {
public:
    int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        

        int x5=max(ax1,bx1),x6=min(ax2,bx2),y5=max(ay1,by1),y6=min(ay2,by2);

         int ari = 0;

    if (x5 <= x6 && y5 <= y6)
        ari = (x6 - x5) * (y6 - y5);


        int ans= ((ax2-ax1)*(ay2-ay1)) +((bx2-bx1)*(by2-by1));

        return ans-ari;
    }
};