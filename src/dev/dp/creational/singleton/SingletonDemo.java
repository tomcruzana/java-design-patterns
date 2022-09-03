package dev.dp.creational.singleton;

import java.util.UUID;

/*
 * 1. create a private static field of the class type & initialize it
 * 2. create a public static getter of its instance
 * 
 * */
public class SingletonDemo {

	public static void main(String[] args) {
		Api api = Api.getApi();
		System.out.println(api.getUuid());
	}

}

class Api {

	private static Api api = new Api();
	private String uuid;

	private Api() {
		this.uuid = UUID.randomUUID().toString();
	}

	public String getUuid() {
		return uuid;
	}

	public static Api getApi() {
		return api;
	}

}
