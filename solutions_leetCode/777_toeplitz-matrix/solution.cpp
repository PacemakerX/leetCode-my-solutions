#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/toeplitz-matrix

class Solution {
public:
    bool isToeplitzMatrix(vector<vector<int>>& matrix) {

        int l=0,m=0;



        while(m<matrix[0].size()){

            int i=l,j=m;
            int init=matrix[i][j];
            while(i<matrix.size() && j<matrix[0].size()){

                if(matrix[i][j]!=init)
                    return false;

                i++;
                j++;
            }
            m++;

        }

        l=0;
        m=0;


        while(l<matrix.size()){
            int i=l;
            int j=m;
            
            int init=matrix[i][j];

            while(i<matrix.size()&& j<matrix[0].size()){
                if(matrix[i][j]!=init)
                    return false;

                i++;
                j++;
            }
            l++;
            
        }
        
        return true;
    }
};