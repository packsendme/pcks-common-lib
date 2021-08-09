package com.packsendme.lib.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ConvertFormat {
	
	public Date convertStringToDate(String dateJson) throws Exception {
		SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		Date dtNow = inFormat.parse(dateJson); 
		return dtNow;
	}
	
	
	// ConvertDateNow-To-String
	public String convertDateNowToStringShort() throws Exception {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateOnly = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateOnly.format(cal.getTime()));
		return dateOnly.format(cal.getTime());
	}
}
