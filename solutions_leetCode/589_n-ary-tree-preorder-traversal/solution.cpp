#include <bits/stdc++.h>
using namespace std;

// https://leetcode.com/problems/n-ary-tree-preorder-traversal

/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution
{
public:
    vector<int> order;
    vector<int> preorder(Node *root)
    {
        order.clear();

        Traversal(root);

        return order;
    }

    void Traversal(Node *node)
    {
        if (node == nullptr)
            return;

        order.push_back(node->val);

        for (auto n : node->children)
            Traversal(n);
    }
};