package com.packsendme.cross.utility;

public class WeightConvert_Utility {
	
	
	public Double kilogramoToGrama(double weight) {
		return weight * 1000;
	}
	
	public Double ToneladaToGrama(double weight) {
		return weight * 1000000;
	}
	
	public Double GramaToKilograma(double weight) {
		return weight / 1000;
	}

	public Double GramaToToneleda(double weight) {
		return weight / 1000000;
	}

}
