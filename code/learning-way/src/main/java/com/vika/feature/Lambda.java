package com.vika.feature;

/**
 * @author ：chenwei.tjw
 * @description：TODO
 * @date ：2020/8/20 10:14 上午
 */


public class Lambda {

    public void test(String x, DoPrint doPrint) {
        doPrint.doSomething(x);
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.test("test lambda", System.out::println);
    }

}
