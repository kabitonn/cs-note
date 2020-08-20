package com.vika.algorithm.nowcoder.swordoffer;

import  com.vika.algorithm.datastructure.TreeNode;

public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));

    }
}
