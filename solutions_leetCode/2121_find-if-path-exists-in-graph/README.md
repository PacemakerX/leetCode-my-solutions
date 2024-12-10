# Find If Path Exists In Graph

**Question ID**: 2121  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 853 ms  
**Memory**: 320.6 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/find-if-path-exists-in-graph

class Solution {
public:
    vector<vector<int>> g;
    vector<int> vis;
    vector<int> dis;
    void bfs(int source){

        vis[source]=1;
        dis[source]=0;

        queue<int>q;
        q.push(source);

        while(!q.empty()){
            int node=q.front();
            q.pop();
            for(auto v : g[node]){
                if(!vis[v]){
                    vis[v]=1;
                    dis[v]=dis[node]+1;
                    q.push(v);
                }
            }
        }
    }
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {

        g.resize(n);
        vis.assign(n,0);
        dis.assign(n,1e9);
        for(auto i: edges){
            g[i[0]].push_back(i[1]);
            g[i[1]].push_back(i[0]);
        }
        
        bfs(source);


        return (!(dis[destination]==1e9));

    }
};
```
