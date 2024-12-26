#include <bits/stdc++.h>
using namespace std;

// https://leetcode.com/problems/reverse-odd-levels-of-binary-tree

struct TreeNode
{
    int val;         // Value of the node
    TreeNode *left;  // Pointer to the left child
    TreeNode *right; // Pointer to the right child

    // Default constructor: initializes value to 0, left and right to nullptr
    TreeNode() : val(0), left(nullptr), right(nullptr) {}

    // Constructor with value: initializes left and right to nullptr
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}

    // Constructor with value and left/right children
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};
class Solution
{
public:
    TreeNode *reverseOddLevels(TreeNode *root)
    {
        DFS(root->left, root->right, 0);
        return root;
    }

private:
    void DFS(TreeNode *leftChild, TreeNode *rightChild, int level)
    {
        if (leftChild == nullptr || rightChild == nullptr)
        {
            return;
        }
        if (level % 2 == 0)
        {
            int temp = leftChild->val;
            leftChild->val = rightChild->val;
            rightChild->val = temp;
        }
        DFS(leftChild->left, rightChild->right, level + 1);
        DFS(leftChild->right, rightChild->left, level + 1);
    }
};