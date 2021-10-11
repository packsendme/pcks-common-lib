package com.packsendme.cross.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatValueMoney {
	
	public double formatDouble(double value) {
	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

	public String formatDoubleStringInCurrency(double value, String language, String country) {
		int places = 2;
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    
	    String vlrResult = NumberFormat.getCurrencyInstance(new Locale(language,country))
	            .format(bd.doubleValue());
	    
	    return vlrResult;
	}
	
	
	
	
}
