package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
    	//메소드 내용작성
    	String str1 = "";
    	for(int i=0; i<strArray.length; i++) {
    		str1 += strArray[i];
    	}
    	return str1;
      
        }
		
    }


