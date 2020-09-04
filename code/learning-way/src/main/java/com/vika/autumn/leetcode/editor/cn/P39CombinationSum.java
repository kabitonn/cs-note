//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 
//
// candidates 中的数字可以无限制重复被选取。 
//
// 说明： 
//
// 
// 所有数字（包括 target）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1： 
//
// 输入：candidates = [2,3,6,7], target = 7,
//所求解集为：
//[
//  [7],
//  [2,2,3]
//]
// 
//
// 示例 2： 
//
// 输入：candidates = [2,3,5], target = 8,
//所求解集为：
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//] 
//
// 
//
// 提示： 
//
// 
// 1 <= candidates.length <= 30 
// 1 <= candidates[i] <= 200 
// candidate 中的每个元素都是独一无二的。 
// 1 <= target <= 500 
// 
// Related Topics 数组 回溯算法 
// 👍 847 👎 0


//Java：组合总和

package com.vika.autumn.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P39CombinationSum {
    public static void main(String[] args) {
        Solution solution = new P39CombinationSum().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> listList = new ArrayList<>();
            combine(listList, new ArrayList<>(), candidates, target, 0);
            return listList;
        }

        public void combine(List<List<Integer>> listList, List<Integer> list, int[] nums, int target, int index) {
            if (target < 0) {
                return;
            } else if (target == 0) {
                listList.add(new ArrayList<>(list));
                return;
            }
            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                combine(listList, list, nums, target - nums[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}