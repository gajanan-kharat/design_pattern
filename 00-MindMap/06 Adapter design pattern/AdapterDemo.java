package com.pattern.structural.adapter;

import java.io.ObjectInputStream.GetField;

public class AdapterDemo {
	public static void main(String[] args) {

		TemperatureClassReporter cel = getObj();
		
		CelciusReporter temp = (CelciusReporter) cel;
		
		temp.getTemperature();
		// class adapter
//		System.out.println("class adapter test");
//		TemperatureInfo tempInfo = new TemperatureClassReporter();
//		testTempInfo(tempInfo);

		// object adapter
//		System.out.println("\n object adapter test");
//		tempInfo = new TemperatureObjectReporter();
//		testTempInfo(tempInfo);

	}

	public static void testTempInfo(TemperatureInfo tempInfo) {
		tempInfo.setTemperatureInC(0);
		System.out.println("temp in C:" + tempInfo.getTemperatureInC());
		System.out.println("temp in F:" + tempInfo.getTemperatureInF());

		tempInfo.setTemperatureInF(85);
		System.out.println("temp in C:" + tempInfo.getTemperatureInC());
		System.out.println("temp in F:" + tempInfo.getTemperatureInF());
	}
	
	private static TemperatureClassReporter getObj() {
		TemperatureClassReporter cel = new TemperatureClassReporter();
		return cel;
	}
}
