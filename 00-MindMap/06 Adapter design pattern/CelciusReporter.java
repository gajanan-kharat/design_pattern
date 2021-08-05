package com.pattern.structural.adapter;

/**
 * Adaptee Class
 * @author lalitc
 *
 */
public class CelciusReporter {
	double temperatureInC;

	public CelciusReporter() {
	}

	public double getTemperature() {
		return temperatureInC;
	}

	public void setTemperature(double temperatureInC) {
		this.temperatureInC = temperatureInC;
	}

}
