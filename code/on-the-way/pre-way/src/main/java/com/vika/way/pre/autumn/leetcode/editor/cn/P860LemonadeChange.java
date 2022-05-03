//在柠檬水摊上，每一杯柠檬水的售价为 5 美元。 
//
// 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。 
//
// 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。 
//
// 注意，一开始你手头没有任何零钱。 
//
// 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。 
//
// 示例 1： 
//
// 输入：[5,5,5,10,20]
//输出：true
//解释：
//前 3 位顾客那里，我们按顺序收取 3 张 5 美元的钞票。
//第 4 位顾客那里，我们收取一张 10 美元的钞票，并返还 5 美元。
//第 5 位顾客那里，我们找还一张 10 美元的钞票和一张 5 美元的钞票。
//由于所有客户都得到了正确的找零，所以我们输出 true。
// 
//
// 示例 2： 
//
// 输入：[5,5,10]
//输出：true
// 
//
// 示例 3： 
//
// 输入：[10,10]
//输出：false
// 
//
// 示例 4： 
//
// 输入：[5,5,10,10,20]
//输出：false
//解释：
//前 2 位顾客那里，我们按顺序收取 2 张 5 美元的钞票。
//对于接下来的 2 位顾客，我们收取一张 10 美元的钞票，然后返还 5 美元。
//对于最后一位顾客，我们无法退回 15 美元，因为我们现在只有两张 10 美元的钞票。
//由于不是每位顾客都得到了正确的找零，所以答案是 false。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= bills.length <= 10000 
// bills[i] 不是 5 就是 10 或是 20 
// 
// Related Topics 贪心算法 
// 👍 123 👎 0


//Java：柠檬水找零

package com.vika.way.pre.autumn.leetcode.editor.cn;

public class P860LemonadeChange {
    public static void main(String[] args) {
        Solution solution = new P860LemonadeChange().new Solution();
        int[] bills = {5, 5, 10, 10, 20};
        System.out.println(solution.lemonadeChange(bills));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {


        public boolean lemonadeChange1(int[] bills) {
            int count5 = 0, count10 = 0;
            for (int bill : bills) {
                if (bill == 5) {
                    count5++;
                } else if (bill == 10) {
                    count10++;
                    if (count5 > 0) {
                        count5--;
                    } else {
                        return false;
                    }
                } else if (bill == 20) {
                    int back = 15;
                    if (count10 > 0) {
                        count10--;
                        back -= 10;
                    }
                    if (back == 5 && count5 > 0) {
                        count5--;
                    } else if (back == 15 && count5 >= 3) {
                        count5 -= 3;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }

        int[] change = {5, 10, 20};
        int lemonPrice = 5;

        public boolean lemonadeChange(int[] bills) {
            int n = change.length;
            int[] changeCount = new int[n];
            for (int bill : bills) {
                for (int i = 0; i < n; i++) {
                    if (change[i] == bill) {
                        changeCount[i]++;
                    }
                }
                int back = bill - lemonPrice;
                for (int i = n - 1; i >= 0; i--) {
                    while (back >= change[i] && changeCount[i] > 0) {
                        back -= change[i];
                        changeCount[i]--;
                    }
                }
                if (back != 0) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}