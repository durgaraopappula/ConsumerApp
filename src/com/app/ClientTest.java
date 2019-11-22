package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest {

	public static void main(String[] args) {

		String URL="http://localhost:2020/ProviderTest/rest/message";
		Client c=	Client.create();
		WebResource wr=c.resource(URL);
		ClientResponse cr=wr.get(ClientResponse.class);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		String str=cr.getEntity(String.class);
		System.out.println(str);

	}

}
