# Maximum Depth of Binary Tree

**Question ID**: 104  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms 
**Memory**: 19.16  MB

## Solution Code
```cpp
//https://leetcode.com/problems/maximum-depth-of-binary-tree
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int depth=0;
    int maxDepth(TreeNode* root) {        

        if(root==nullptr)
            return 0;

        depth=0;
        Traversal(root,0);
        return depth+1;
    }

    void Traversal(TreeNode* node, int level){
        if(node==nullptr)
            return;

        if(node->left!=nullptr)
            Traversal(node->left,level+1);
        
        if(node->right!=nullptr)
            Traversal(node->right,level+1);
        
        depth=max(depth,level);
    }
};
```
