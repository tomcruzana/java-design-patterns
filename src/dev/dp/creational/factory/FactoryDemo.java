package dev.dp.creational.factory;

/*
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 * a concrete factory class is responsible for object creation
 * */

public class FactoryDemo {

	public static void main(String[] args) {
		PillowFactory.getPillow("latex").init();
		PillowFactory.getPillow("cotton").init();
		PillowFactory.getPillow("feather").init();
	}

}

interface Pillow {
	public void init();
}

class FeatherPillow implements Pillow {

	@Override
	public void init() {
		float softness = 99.9f;
		String color = "white";
		String shape = "square";
		System.out.printf("%.2f %s %s%n", softness, color, shape);

	}

}

class CottonPillow implements Pillow {

	@Override
	public void init() {
		float softness = 87.0f;
		String color = "red";
		String shape = "square";
		System.out.printf("%.2f %s %s%n", softness, color, shape);
	}

}

class LatexPillow implements Pillow {

	@Override
	public void init() {
		float softness = 49.9f;
		String color = "gray";
		String shape = "round";
		System.out.printf("%.2f %s %s%n", softness, color, shape);

	}

}

class PillowFactory {
	public static Pillow getPillow(String p) {
		if (p.equalsIgnoreCase("feather")) {
			return new FeatherPillow();
		} else if (p.equalsIgnoreCase("cotton")) {
			return new CottonPillow();
		} else if (p.equalsIgnoreCase("latex")) {
			return new LatexPillow();
		}
		return null;
	}
}
