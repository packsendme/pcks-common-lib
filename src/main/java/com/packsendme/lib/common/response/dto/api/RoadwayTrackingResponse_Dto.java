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
	public double toll_price;
	public double country_distanceF;
	public double country_distanceM;
	public double fuelGasoline_price;
	public double fuelDiesel_price;
	public String currency;
	public String unity_measurement_distance;
	
	public RoadwayTrackingResponse_Dto(String name_country, int toll_amount, double toll_price, double country_distanceF, double country_distanceM,
			double fuelGasoline_price, double fuelDiesel_price, String currency, String unity_measurement_distance) {
		super();
		this.name_country = name_country;
		this.toll_amount = toll_amount;
		this.toll_price = toll_price;
		this.country_distanceF = country_distanceF;
		this.country_distanceM = country_distanceM;
		this.fuelGasoline_price = fuelGasoline_price;
		this.fuelDiesel_price = fuelDiesel_price;
		this.currency = currency;
		this.unity_measurement_distance = unity_measurement_distance;
	}
	
	

	

	
}
