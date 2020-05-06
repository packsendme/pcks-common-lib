package com.packsendme.lib.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ConvertFormat {
	
	public Date convertStringToDate(String dateJson) throws Exception {
		SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		Date dtNow = inFormat.parse(dateJson); 
		return dtNow;
	}
	
	public Date convertStringToDateShort(String dateJson) throws Exception {
		SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dtNow = inFormat.parse(dateJson); 
		return dtNow;
	}
}
