//你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上
//被小偷闯入，系统会自动报警。 
//
// 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。 
//
// 
//
// 示例 1： 
//
// 输入：[1,2,3,1]
//输出：4
//解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
//     偷窃到的最高金额 = 1 + 3 = 4 。 
//
// 示例 2： 
//
// 输入：[2,7,9,3,1]
//输出：12
//解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
//     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 100 
// 0 <= nums[i] <= 400 
// 
// Related Topics 动态规划 
// 👍 1053 👎 0


//Java：打家劫舍

package com.vika.autumn.leetcode.editor.cn;

import org.junit.Test;

public class P198HouseRobber {
    public static void main(String[] args) {
        Solution solution = new P198HouseRobber().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rob1(int[] nums) {
            int sum1 = 0, sum2 = 0;
            for (int num : nums) {
                int tmp = sum1;
                sum1 = sum2 + num;
                sum2 = Math.max(tmp, sum2);
            }
            return Math.max(sum1, sum2);
        }

        public int rob2(int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return nums[0];
            }
            int[] dp = new int[n + 1];
            dp[1] = nums[0];
            for (int i = 2; i <= n; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
            }
            return dp[n];
        }

        public int rob(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int prev = 0;
            int cur = 0;
            for (int num : nums) {
                int tmp = cur;
                cur = Math.max(cur, prev + num);
                prev = tmp;
            }
            return cur;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    @Test
    public void test() {
        Solution solution = new Solution();

    }
}