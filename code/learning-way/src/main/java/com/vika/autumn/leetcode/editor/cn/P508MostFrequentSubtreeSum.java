//给你一个二叉树的根结点，请你找出出现次数最多的子树元素和。一个结点的「子树元素和」定义为以该结点为根的二叉树上所有结点的元素之和（包括结点本身）。 
//
// 你需要返回出现次数最多的子树元素和。如果有多个元素出现的次数相同，返回所有出现次数最多的子树元素和（不限顺序）。 
//
// 
//
// 示例 1： 
//输入: 
//
//   5
// /  \
//2   -3
// 
//
// 返回 [2, -3, 4]，所有的值均只出现一次，以任意顺序返回所有值。 
//
// 示例 2： 
//输入： 
//
//   5
// /  \
//2   -5
// 
//
// 返回 [2]，只有 2 出现两次，-5 只出现 1 次。 
//
// 
//
// 提示： 假设任意子树元素和均可以用 32 位有符号整数表示。 
// Related Topics 树 哈希表 
// 👍 81 👎 0


//Java：出现次数最多的子树元素和

package com.vika.autumn.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P508MostFrequentSubtreeSum {
    public static void main(String[] args) {
        Solution solution = new P508MostFrequentSubtreeSum().new Solution();
        // TO TEST
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public int[] findFrequentTreeSum(TreeNode root) {
            Map<Integer, Integer> map = new HashMap<>();
            sumTree(map, root);
            List<Integer> list = new ArrayList<>();
            int max = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    list = new ArrayList<>();
                    list.add(entry.getKey());
                } else if (entry.getValue() == max) {
                    list.add(entry.getKey());
                }
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }

        public int sumTree(Map<Integer, Integer> map, TreeNode p) {
            if (p == null) {
                return 0;
            }
            int sum = p.val;
            sum += sumTree(map, p.left);
            sum += sumTree(map, p.right);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}