package com.vika.algorithm.nowcoder.swordoffer;

import algorithm.datastructure.TreeNode;

public class HasSubtree {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return isSameTree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public boolean isSameTree(TreeNode t1, TreeNode t2) {
        if (t2 == null) {
            return true;
        } else if (t1 == null || t1.val != t2.val) {
            return false;
        }
        return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }
}
