package com.packsendme.lib.utility;

public class DistanceConvert {
	
	public double distanceKM_to_Meters(double distance) {
		return distance * 1000;
		
	}
	
	public double distanceMeters_to_KM(double distance) {
		return distance / 1000;
	}

}
