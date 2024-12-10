#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/spiral-matrix-ii

class Solution {
public:
    vector<vector<int>> generateMatrix(int n)
{

    int top = 0, bottom = n - 1, left = 0, right = n - 1;

    vector<vector<int>> ans(n, vector<int>(n));

    int k = 1;
    while (top <= bottom && left <= right)
    {

        for (int i = left; i <= right; i++)
        {
            ans[top][i] = k++;
        }
        top++;

        for (int i = top; i <= bottom; i++)
        {
            ans[i][right] = k++;
        }
        right--;

        for (int i = right; i >= left; i--)
        {
            ans[bottom][i] = k++;
        }
        bottom--;

        for (int i = bottom; i >= top; i--)
        {
            ans[i][left] = k++;
        }
        left++;
    }

    return ans;
}

};