package dev.dp.structural.adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		UsCar ford = new UsCar();
		ford.brand = ford.getClass().getSimpleName();
		double mph = ford.getMphSpeed(75.00);
		System.out.println(ford.brand + " is driving at " + String.format("%.2f", mph) + "Mph");

		VehicleKphAdapter vkph = new VehicleKphAdapter();
		double kph = vkph.convertKphSpeed(mph);
		System.out.println(ford.brand + " is driving at " + String.format("%.2f", kph) + "Kph");
	}

}

interface VehicleDashboardMph {
	public double getMphSpeed(double speed);
}

class UsCar implements VehicleDashboardMph {
	String brand;

	@Override
	public double getMphSpeed(double speed) {
		return speed;
	}

}

interface VehicleDashboardKph {
	public double convertKphSpeed(double mph);
}

class VehicleKphAdapter implements VehicleDashboardKph {

	@Override
	public double convertKphSpeed(double mph) {
		Double kph = (mph * 1.60934);
		return kph;
	}

}