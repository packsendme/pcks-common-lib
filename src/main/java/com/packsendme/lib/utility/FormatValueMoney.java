package com.packsendme.lib.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatValueMoney {
	
	public String valueFormatToString(double value, String language, String country) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale(language,country));
		String vlrFormat = "0.00";
		
		if(value >= 1000) {
			nf.setMaximumFractionDigits(0);
			String vl01 = nf.format(value);
			vlrFormat = vl01.substring(0, vl01.length()-1);
		}
		else {
			nf.setMinimumFractionDigits(2);
			nf.setMaximumFractionDigits(2);
			vlrFormat = nf.format(value);
		}
		return vlrFormat;
	}
	
	public double doubleFormatRound(double value) {
	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
