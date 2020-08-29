package com.vika.algorithm.leetcode.easy.S401_500;

public class S434StringCountSegments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int countSegments(String s) {
    	return s.trim().length() == 0 ? 0 : s.trim().split("\\s+").length; 
    }
    public int countSegments1(String s) {
    	s = s.trim();
    	int count = 0;
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)!=' '&&(i==0||s.charAt(i-1)==' ')) {
    			count++;
    		}
    	}
    	return count;
    }
}
