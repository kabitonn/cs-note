package com.vika.autumn.company.alibaba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author tangjiawei
 * @Date 2020/8/28
 */
public class PermuteDive {

    public List<Integer> permute(int n) {
        char[] num = String.valueOf(n).toCharArray();
        Arrays.sort(num);
        List<Integer> integerList = new ArrayList<>();
        backtrack(integerList, new boolean[num.length], new ArrayList<>(), num);
        return integerList;
    }

    public void backtrack(List<Integer> stringList, boolean[] visited, List<Character> list, char[] num) {
        if (list.size() == num.length) {
            if (list.get(0) != '0') {
                stringList.add(Integer.valueOf(String.valueOf(list.toArray())));
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (i > 0 && num[i] == num[i - 1] && !visited[i - 1]) {
                continue;
            }
            if (!visited[i]) {
                list.add(num[i]);
                visited[i] = true;
                backtrack(stringList, visited, list, num);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }

    public int countFit(int n, int m) {
        int count = 0;
        List<Integer> nums = permute(n);
        for (int num : nums) {
            if (num % m == 0) {
                count++;
            }
        }
        return count;
    }
}
