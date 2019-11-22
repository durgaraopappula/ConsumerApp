package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest4 {
	public static void main(String[] args) {

		String URL="http://localhost:2020/ProviderTest4/rest/msg/service;eId=15535;eName=Durgarao;eSal=255.50";
		Client c=	Client.create();
		WebResource wr=c.resource(URL);
		ClientResponse cr=wr.get(ClientResponse.class);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		String str=cr.getEntity(String.class);
		System.out.println(str);
	}

}
