package com.vika.algorithm.leetcode.midium.S801_1000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S945MinimumIncrementtoMakeArrayUnique {

    public int minIncrementForUnique(int[] A) {
        int move = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : A) {
            while (set.contains(n)) {
                n++;
                move++;
            }
            set.add(n);
        }
        return move;
    }

    public int minIncrementForUnique1(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        int prev = A[0];
        int move = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > prev) {
                prev = A[i];
            } else {
                move += prev + 1 - A[i];
                prev = prev + 1;
            }
        }
        return move;
    }
}
