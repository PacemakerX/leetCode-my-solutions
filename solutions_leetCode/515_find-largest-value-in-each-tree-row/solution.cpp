#include <bits/stdc++.h>
using namespace std;

// https://leetcode.com/problems/find-largest-value-in-each-tree-row
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
class Solution
{
public:
    vector<int> vals;
    vector<int> largestValues(TreeNode *root)
    {
        vals.clear();

        Traversal(root, 0);

        return vals;
    }

    void Traversal(TreeNode *node, int level)
    {
        if (node == nullptr)
            return;

        if (level == vals.size())
            vals.push_back(node->val);
        else
            vals[level] = max(vals[level], node->val);

        if (node->left != nullptr)
            Traversal(node->left, level + 1);

        if (node->right != nullptr)
            Traversal(node->right, level + 1);
    }
};
