package com.au.soapAss.com;

import javax.xml.ws.Endpoint;
public class FootballPoolPublisher {
	
	public static void main(String[] args) {
		  Endpoint.publish("http://localhost:8087/ws/footballPool",new FootballPoolImpl());
		 }

	}


