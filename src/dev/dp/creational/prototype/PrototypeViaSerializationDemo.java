package dev.dp.creational.prototype;

import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

/*
 * 1. must implement serializable
 * 2. use from SerializationUtils.roundtrip(serializableObj);
 *     org.apache.commons.lang3.SerializationUtils;
 * */

public class PrototypeViaSerializationDemo {
	public static void main(String[] args) {
		Television t1 = new Television("X10", "4K");
		Television t2 = SerializationUtils.roundtrip(t1);
		t2.screenSize = "8K";

		System.out.println(t1);
		System.out.println(t2);
	}

}

class Television implements Serializable {
	String model;
	String screenSize;

	public Television(String model, String screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Television [model=" + model + ", screenSize=" + screenSize + "]";
	}

}