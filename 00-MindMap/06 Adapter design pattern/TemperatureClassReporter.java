package com.pattern.structural.adapter;

/**
 * Adapter Class
 * @author lalitc
 *
 */
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo {
	@Override
	public double getTemperatureInC() {
		return temperatureInC;
	}

	@Override
	public double getTemperatureInF() {
		return celciusToFahrenheit(temperatureInC);
	}

	@Override
	public void setTemperatureInC(double temperatureInC) {
		this.temperatureInC = temperatureInC;
	}

	@Override
	public void setTemperatureInF(double temperatureInF) {
		this.temperatureInC = fahrenheitToCelcius(temperatureInF);
	}

	private double fahrenheitToCelcius(double f) {
		return ((f - 32) * 5 / 9);
	}

	private double celciusToFahrenheit(double c) {
		return ((c * 9 / 5) + 32);
	}

}
