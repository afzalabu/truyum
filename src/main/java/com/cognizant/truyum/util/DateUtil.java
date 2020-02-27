package com.cognizant.truyum.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date convertToDate(String date) {
		
		Date convertedDate = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
			if(date != null && date != "")
			convertedDate = simpleDateFormat.parse(date);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
		return convertedDate;
		
	}
	
}
