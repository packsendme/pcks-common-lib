package com.packsendme.lib.common.exchange;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter 
public class Exchange implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String fromCurrent;
	public String toCurrent;
	public double value;
	public String dt_exchange;
	
	
	public Exchange(String fromCurrent, String toCurrent, double value, String dt_exchange) {
		super();
		this.fromCurrent = fromCurrent;
		this.toCurrent = toCurrent;
		this.value = value;
		this.dt_exchange = dt_exchange;
	}


	public Exchange() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
