#include <bits/stdc++.h>
using namespace std;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal
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

class Solution {
public:
vector<int> order;
    vector<int> postorder(Node* root) {
        
        order.clear();
        Traversal(root);

        return order;
    }
        void Traversal(Node* node){
        if(node==nullptr)
            return;
        
        
      for(auto n : node->children)
            Traversal(n);

        order.push_back(node->val);
    }
};
