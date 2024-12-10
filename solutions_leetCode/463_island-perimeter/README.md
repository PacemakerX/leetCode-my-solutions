# Island Perimeter

**Question ID**: 463  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 87 ms  
**Memory**: 105.7 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/island-perimeter

class Solution {
public:
typedef pair<int,int> pii;

int n,m;
vector<vector<int>> vis;
vector<int> dx = {-1, 1, 0, 0};
vector<int> dy = {0, 0, -1, 1};
int peri=0;

void dfs(pii node,vector<vector<int>>& grid)
{
    int x = node.first;
    int y = node.second;
    vis[x][y] = 1;


    for(int i=0;i<4;i++)
    {

        int nx = x + dx[i];
        int ny = y + dy[i];

        if ((nx >= 0 && nx < n) && (ny >= 0 && ny < m) && grid[nx][ny])
        {
            if (!vis[nx][ny])
                dfs(make_pair(nx, ny), grid);
        }
        else
            peri++;
    }
}
    int islandPerimeter(vector<vector<int>>& grid) {
        n=grid.size();
        m=grid[0].size();

        vis.assign(n, vector<int>(m,0));
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] && !vis[i][j])
                dfs(make_pair(i,j),grid);
            }
        }
        
        return peri;

    }
};
```
