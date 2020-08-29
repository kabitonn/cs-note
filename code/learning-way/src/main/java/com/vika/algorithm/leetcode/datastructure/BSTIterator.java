package com.vika.algorithm.leetcode.datastructure;


import com.vika.algorithm.leetcode.common.TreeNode;

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode p = stack.pop();
        int value = p.val;
        p = p.right;
        while (p != null) {
            stack.push(p);
            p = p.left;
        }
        return value;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
