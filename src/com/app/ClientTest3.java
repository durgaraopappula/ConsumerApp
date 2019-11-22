package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest3 {
	public static void main(String[] args) {

		String URL="http://localhost:2020/ProviderTest3/rest/msg/service";
		Client c=	Client.create();
		WebResource wr=c.resource(URL);
		wr=wr.queryParam("eId", "75535");
		wr=wr.queryParam("eName", "Durgarao");
		wr=wr.queryParam("eSal", "254.85");
		ClientResponse cr=wr.get(ClientResponse.class);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		String str=cr.getEntity(String.class);
		System.out.println(str);


	}
}
