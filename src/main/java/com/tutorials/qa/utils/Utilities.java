package com.tutorials.qa.utils;

import java.util.Date;

public class Utilities {
	
	public static final int IMPLICIT_WAIT_TIME=20;
	public static final int PAGE_LOAD_TIME=10;
	
	public static String generateEmailWithTimeStamp() {
		
		Date date = new Date();
		String timestamp = date.toString().replace(" ","_").replace(":","_");
		return "amotoori"+timestamp+"@gmail.com";
		
	}

}
