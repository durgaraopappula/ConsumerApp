package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest8 {
	public static void main(String[] args) {
		String URL="http://localhost:2020/ProviderTest8/rest/payment/info";
		//String json="{}";
		String json="{\"txId\":75535,\"custmer\":\"Durga\",\"offer\":3.2}";
		Client c=Client.create();
		WebResource wr=c.resource(URL);
		ClientResponse cr=wr.header("Content-Type", "application/json").post(ClientResponse.class,json);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		System.out.println(cr.getEntity(String.class));
	}

}
