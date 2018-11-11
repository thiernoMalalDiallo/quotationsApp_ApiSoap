package server;

import javax.xml.ws.Endpoint;
import metier.*;
import webService.*;
import DAO.*;


public class server {

	public static void main(String[] args) {
		
		String url = "http://localhost:8585/";
		Endpoint.publish(url, new QuotationsService());
		System.out.println("service deployed");
	}

}
