package com.subject;

import java.util.ArrayList;
import java.util.List;

import com.observer.Subscriber;

public class Channel {

	private String channelName;
	private List<Subscriber> listOfSubscriber = new ArrayList<>();
	
	public Channel(String channelName) {
		this.channelName = channelName;
	}

	public void suscribeChannel(Subscriber sub) {
		listOfSubscriber.add(sub);
	}

	public void unSuscribeChannel(Subscriber sub) {
		listOfSubscriber.remove(sub);
	}
	
	private void notifySubscriber(String videoTitle){
		listOfSubscriber.forEach(sub -> sub.updateOnChannel(videoTitle, getChannelName()));
	}
	
	public void upload(String videoTitle){
		notifySubscriber(videoTitle);
	}
	

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public List<Subscriber> getListOfSubscriber() {
		return listOfSubscriber;
	}

	public void setListOfSubscriber(List<Subscriber> listOfSubscriber) {
		this.listOfSubscriber = listOfSubscriber;
	}
}
