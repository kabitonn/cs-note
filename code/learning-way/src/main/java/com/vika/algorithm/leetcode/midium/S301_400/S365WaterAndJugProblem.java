package com.vika.algorithm.leetcode.midium.S301_400;

public class S365WaterAndJugProblem {

    public boolean canMeasureWater(int x, int y, int z) {
        if (z == 0) {
            return true;
        }

        int gcd = gcd(x, y);
        if (gcd == 0 || x + y < z) {
            return false;
        }
        return z % gcd == 0;
    }

    public int gcd(int x, int y) {
        int r;
        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
