package com.qinweiping.tools;

import java.util.regex.Pattern;

public class Tools {

	/*
	 * �ж��Ƿ�Ϊ���� 
	 * @param str ������ַ��� 
	 * @return ����������true,���򷵻�false 
	 */
	public static boolean isInteger(String str) {  
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
		return pattern.matcher(str).matches();  
	}
}
