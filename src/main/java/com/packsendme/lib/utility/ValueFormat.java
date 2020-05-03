package com.packsendme.lib.utility;

import java.text.NumberFormat;
import java.util.Locale;

public class ValueFormat {
	
	public String valueFormatToString(double value, String language, String country) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale(language,country));
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(3);
		return nf.format(value);
	}
}
