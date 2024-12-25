#include <bits/stdc++.h>
using namespace std;

// https://leetcode.com/problems/binary-tree-postorder-traversal

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
    vector<int> order;
    vector<int> postorderTraversal(TreeNode *root)
    {
        order.clear();

        Traversal(root);

        return order;
    }

    void Traversal(TreeNode *node)
    {
        if (node == nullptr)
            return;

        if (node->left != nullptr)
            Traversal(node->left);

        if (node->right != nullptr)
            Traversal(node->right);

        order.push_back(node->val);
    }
};