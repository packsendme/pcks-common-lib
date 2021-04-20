package com.packsendme.lib.common.response.dto.api;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoogleAPIDistanceResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	public String destination;
	public String origin;
	public Double distanceM;
	public Double distanceF;
	public String measureUnit;
	public String status;
}
