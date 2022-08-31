package dev.dp.creational.prototype;

/*
 * https://www.baeldung.com/java-copy-constructor
 * */

public class PrototypeViaConstructorCopyDemo {
	public static void main(String[] args) {
		Phone p1 = new Phone("A10", "1024 x 768");
		Phone p1_clone = p1.copy();
		p1_clone.setResolution("4028 x 1024");
		
		System.out.println(p1);
		System.out.println(p1_clone);
	}

}

// PROTOTYPE via Copy Constructor
class Phone {
	private String model;
	private String resolution;

	public Phone(String model, String resolution) {
		this.model = model;
		this.resolution = resolution;
	}

	// analyze this
	public Phone(Phone p) {
		this.model = p.model;
		this.resolution = p.resolution;
	}

	// analyze this
	public Phone copy() {
		return new Phone(this);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", resolution=" + resolution + "]";
	}

}