package com.observer;

public class Subscriber {
	
	private String name;
	

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void updateOnChannel(String videoTitle, String channelName){
		System.out.println("Hey "+getName()+ " Video "+ videoTitle +" Uploaded by channel "+channelName);
	}

}
