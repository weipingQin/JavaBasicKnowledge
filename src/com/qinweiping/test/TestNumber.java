package com.qinweiping.test;

import com.qinweiping.tools.Tools;

public class TestNumber {
	public static void main(String[] args) {
		String number = "1234567";
		boolean isNumber = Tools.isInteger(number);
		if(isNumber){
			System.out.println("此数字符合数字!");
		}else{
			System.out.println("此数字不符合数字!");
		}
	}
	
}	
