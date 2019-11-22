package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientApp6 {
	public static void main(String[] args) {
		String URL="http://localhost:2020/ProviderTest6/rest/user/service";
		Client c=Client.create();
		WebResource wr=c.resource(URL);
		ClientResponse cr=wr.header("code", "admin").header("access", "sathya").get(ClientResponse.class);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		System.out.println(cr.getEntity(String.class));
	}

}
