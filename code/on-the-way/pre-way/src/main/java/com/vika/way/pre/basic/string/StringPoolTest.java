package com.vika.way.pre.basic.string;

import org.junit.Test;

public class StringPoolTest {

    @Test
    public void testIntern(){
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);// false
        String s3 = s1.intern();
        String s4 = s1.intern();
        System.out.println(s3 == s4);//true
    }

    @Test
    public void testIntern2(){
        String str1 = "ja";
        String str2 = "va";
        String str = str1+str2;
        String s=str.intern();
        String str3="java";
        System.out.println(s==str);
        System.out.println(str==str3);
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(str));
    }

    public void testIntern3(){
        String str1 = "str";
        String str2 = "ing";
        String str = str1+str2; //在堆上创建的新的对象，常量池中还不存在对应实例
        String s=str.intern();
        String str3="string";
        System.out.println(s==str);//true 常量池中字面量的引用是堆中的引用实例，因为"string"第一次出现是在堆中
        System.out.println(str==str3);//true 常量池中字面量的引用是堆中的引用实例，str3查找时已出现在常量池中
        System.out.println(System.identityHashCode(s));//460141958 地址
        System.out.println(System.identityHashCode(str));//460141958 地址
    }
}
