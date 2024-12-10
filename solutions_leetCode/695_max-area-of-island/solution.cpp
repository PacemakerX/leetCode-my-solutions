#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/max-area-of-island

class Solution {
public:
typedef pair<int,int> pii;
typedef vector<int> vi;
typedef vector<pii> vpii;
typedef vector<vi> vvi;
#define mp make_pair
#define forn(i, n) for (int i = 0; i < int(n); i++)

vvi vis;
int n,m;
vi sz;

vi dx = {-1, 1, 0, 0};
vi dy = {0, 0, -1, 1};
void dfs(pii node, int compNum,vector<vector<int>>& grid)
{
    int x = node.first;
    int y = node.second;
    vis[x][y] = compNum;
    sz[compNum]++;

    forn(i, 4)
    {

        int nx = x + dx[i];
        int ny = y + dy[i];

        if ((nx >= 0 && nx < n) && (ny >= 0 && ny < m) &&grid[nx][ny])
        {
            if (!vis[nx][ny])
                dfs(mp(nx, ny), compNum,grid);
        }
        
    }
}
    int maxAreaOfIsland(vector<vector<int>>& grid) {

        n=grid.size();
        m=grid[0].size();

        vis.assign(n,vi(m,0));
        sz.assign((n*m)+1,0);
        
        int compSize = 0;
    forn(i, n)
    {
        forn(j, m)
        {

            if (grid[i][j] && !vis[i][j])
            {
                compSize++;
                dfs(mp(i, j), compSize,grid);
            }
        }
    }

    int maxArea=0;

    forn(i,n*m+1){
        maxArea=max(maxArea,sz[i]);
    }

    return maxArea;

    }

};