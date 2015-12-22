package com.qinweiping.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileUtil {

	public static String getContentFromFile(String filePath,String fileName){
		String encoding = "GBK"; // 字符编码(可解决中文乱码问题 )
		String filePathStr = filePath +"/"+fileName;
		File file = new File(filePathStr);   
		if(file.isFile() && file.exists()){
			try {
				InputStreamReader read = new InputStreamReader(new FileInputStream(filePathStr),encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				try {
					String lineText =  null;
					while ((lineText = bufferedReader.readLine()) != null) {   
						System.out.println(lineText.toString().trim());   
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}   
				try {
					read.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;
	}
}
