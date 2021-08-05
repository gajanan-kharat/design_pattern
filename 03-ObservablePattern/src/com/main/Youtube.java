package com.main;

import com.observer.Subscriber;
import com.subject.Channel;

public class Youtube {
	
	public static void main(String[] args) {
		
		Subscriber s1 = new Subscriber("Gajanan");
		Subscriber s2 = new Subscriber("Sonali");
		Subscriber s3 = new Subscriber("Naga");
		
		Channel channel = new Channel("BSR_English Learning");
		channel.suscribeChannel(s1);
		channel.suscribeChannel(s2);
		channel.suscribeChannel(s3);
		
		channel.unSuscribeChannel(s3);
		
		//Notify to observer(Subscriber) that video is being uploaded
		channel.upload("Learn English in 90 days course");
		
		
		
	}

}
