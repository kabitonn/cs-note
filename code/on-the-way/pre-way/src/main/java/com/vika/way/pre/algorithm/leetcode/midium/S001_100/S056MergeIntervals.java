package com.vika.way.pre.algorithm.leetcode.midium.S001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S056MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        S056MergeIntervals solution = new S056MergeIntervals();
        System.out.println(solution.merge(intervals));
     }
    public int[][] merge(int[][] intervals) {
        List<int[]> arrayList = new ArrayList<>();
        if (intervals == null || intervals.length == 0) {
            return arrayList.toArray(new int[0][]);
        }

         //Arrays.sort(intervals, (a, b) -> a[0] - b[0]);// a[0] - b[0]大于0就交换顺序
        // 根据二维数组第一个数字大小按每一行整体排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int i = 0;
        while (i < intervals.length) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            // i不能到最后一行,所以要小于(数组的长度 - 1)
            // 判断所在行的right和下一行的left大小,对right重新进行赋最大值,之后再不断进行while循环判断
            while (i < intervals.length - 1 && right >= intervals[i + 1][0]) {
                i++;
                right = Math.max(right, intervals[i][1]);
            }
            arrayList.add(new int[]{left, right});
            i++;
        }
        return arrayList.toArray(new int[arrayList.size()+1][]);
    }
}