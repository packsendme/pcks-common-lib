package com.packsendme.cross.utility;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LocaleCountry {
	
	public Map<String,String> locateList(String country) {
	    Locale locales[] = SimpleDateFormat.getAvailableLocales();
	    Map<String,String> countryLocateL = new HashMap<String,String>();
	    
	    for (int i = 0; i < locales.length; i++) {
	     	if(locales[i].getDisplayCountry().equals(country)) {
	     		countryLocateL.put(locales[i].getLanguage(), locales[i].getCountry());
	     		return countryLocateL;
	     	}
	    }
	    return countryLocateL;
	}

}
