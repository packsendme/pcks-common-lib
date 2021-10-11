package com.packsendme.cross.common.exchange;

import java.io.Serializable;

public class ExchangeCountry implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String currencyId;
	public String currencyName;
	public String currencySymbol;
	
	public ExchangeCountry(String currencyId, String currencyName, String currencySymbol) {
		super();
		this.currencyId = currencyId;
		this.currencyName = currencyName;
		this.currencySymbol = currencySymbol;
	}
}
