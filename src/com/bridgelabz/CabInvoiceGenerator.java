package com.bridgelabz;

public class CabInvoiceGenerator {
	public static final int MINIMUM_COST_PER_KM=10;
	public static final int COST_PER_TIME=1;
	public static final int MINIMUM_FARE=5;
	public double calculateFare(double distance, int time) {
		double totalFare=distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
		if(totalFare<MINIMUM_FARE) {
			return MINIMUM_FARE;
		}
		return totalFare;
	}
	public double calculateFare(Ride[] rides) {
		double totalFare=0;
		for(Ride ride:rides) {
			totalFare+=this.calculateFare(ride.distance,ride.time);
		}
		return totalFare;
	}
}
