package com.packsendme.lib.common.response.dto.api;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoadwayTrackingResponse_Dto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name_country;
	public int toll_amount;
	public Double toll_price;
	public Double country_distanceF;
	public Double country_distanceM;
	public Double fuelGasoline_price;
	public Double fuelDiesel_price;

	public String currency_price;
	public String unity_measurement_distance;
	
	public RoadwayTrackingResponse_Dto(String name_country, int toll_amount, Double toll_price, Double country_distanceF, Double country_distanceM,
			Double fuelGasoline_price, Double fuelDiesel_price) {
		super();
		this.name_country = name_country;
		this.toll_amount = toll_amount;
		this.toll_price = toll_price;
		this.country_distanceF = country_distanceF;
		this.country_distanceM = country_distanceM;
		this.fuelGasoline_price = fuelGasoline_price;
		this.fuelDiesel_price = fuelDiesel_price;
	}
	
	

	

	
}
