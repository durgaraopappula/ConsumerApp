package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class ClientTest5 {
	public static void main(String[] args) {
		String URL="http://localhost:2020/ProviderTest5/rest/payment/de";
		Client c=	Client.create();
		WebResource wr=c.resource(URL);
		//CREATE LOGICAL FORM
		Form form=new Form();
		form.add("uname", "Paparao");
		form.add("ucard", 123456789l);
		form.add("amt", 5478.65);
		form.add("cvv", 789);
		ClientResponse cr=wr.post(ClientResponse.class,form);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		System.out.println(cr.getEntity(String.class));

	}

}
