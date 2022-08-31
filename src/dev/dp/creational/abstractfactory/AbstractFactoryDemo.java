package dev.dp.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		ComputerFactory cf = new ComputerFactory();
		Computer computer1 = cf.make("laptop");
		System.out.println(computer1.start());
		System.out.println(computer1.stop());

		Computer computer2 = cf.make("desktop");
		System.out.println(computer2.start());
		System.out.println(computer2.stop());
	}

}

interface Computer {
	public default String start() {
		return this.getClass().getSimpleName() + " is started.";
	};

	public default String stop() {
		return this.getClass().getSimpleName() + " is stopped.";
	};
}

class DesktopComputer implements Computer {
}

class LaptopComputer implements Computer {

}

interface AbstractComputerFactory {
	public Computer make(String type);
}

class ComputerFactory implements AbstractComputerFactory {

	@Override
	public Computer make(String type) {
		if (type.equalsIgnoreCase("desktop"))
			return new DesktopComputer();
		else if (type.equalsIgnoreCase("laptop"))
			return new LaptopComputer();
		return null;
	}
}