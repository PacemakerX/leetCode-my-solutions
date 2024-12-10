# Number Of Islands

**Question ID**: 200  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 29 ms  
**Memory**: 17.1 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/number-of-islands

class Solution {
public:
    int n,m;
    vector<vector<int>> vis;


void dfs(int a, int b,vector<vector<char>>& grid)
{
    if (a < 0 || a >= n || b < 0 || b >= m || grid[a][b] == '0' || vis[a][b])
        return;
    else
    {

        vis[a][b] = 1;

        dfs(a - 1, b,grid);
        dfs(a + 1, b,grid);
        dfs(a, b - 1,grid);
        dfs(a, b + 1,grid);
    }
}

    
    int numIslands(vector<vector<char>>& grid) {
        

        n=grid.size();
        m=grid[0].size();
        // vis.clear();
        vis.assign(n,vector<int>(m,0));

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);

                }
            }
        }

        return count;
    }
};
```
