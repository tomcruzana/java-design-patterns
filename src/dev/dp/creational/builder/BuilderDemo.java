package dev.dp.creational.builder;

import java.util.ArrayList;
import java.util.List;

/*
 * -Some objects are simple and can be created in a single constructor call 
 * -Other objects require a lot of ceremony to create Having an object with 10 constructor arguments is not productive 
 * -Instead, opt for piecewise construction 
 * -Builder provides an API for constructing an object step-by-step
 * 
 * Builder pattern
 * -When piecewise obj construction is complicated,
 * provide an API for doing it succinctly
 * -a fluent interface is also known as api chaining
 * */
public class BuilderDemo {
	public static void main(String[] args) {
		BurgerBuilder bb = new BurgerBuilder();
		for (ChickenBurger cb : bb.prepareOrder()) {
			System.out.println(cb);
		}
	}
}

class ChickenBurger {
	private int buns;
	private int patty;
	private int cheese;
	private int tomato;
	private int pickle;
	private int mayo;
	private int ketchup;
	private int mustard;

	public ChickenBurger(int buns, int patty, int cheese, int tomato, int pickle, int mayo, int ketchup, int mustard) {
		super();
		this.buns = buns;
		this.patty = patty;
		this.cheese = cheese;
		this.tomato = tomato;
		this.pickle = pickle;
		this.mayo = mayo;
		this.ketchup = ketchup;
		this.mustard = mustard;
	}

	@Override
	public String toString() {
		return "ChickenBurger [buns=" + buns + ", patty=" + patty + ", cheese=" + cheese + ", tomato=" + tomato
				+ ", pickle=" + pickle + ", mayo=" + mayo + ", ketchup=" + ketchup + ", mustard=" + mustard + "]";
	}

}

class Order {
	private List<ChickenBurger> order;

	public List<ChickenBurger> getOrder() {
		return order;
	}

	public void setOrder(List<ChickenBurger> order) {
		this.order = order;
	}

}

class BurgerBuilder {
	public List<ChickenBurger> prepareOrder() {
		ChickenBurger cb1 = new ChickenBurger(2, 1, 1, 2, 2, 1, 1, 1);
		ChickenBurger cb2 = new ChickenBurger(2, 1, 1, 2, 3, 2, 2, 2);
		ChickenBurger cb3 = new ChickenBurger(21, 11, 21, 32, 33, 42, 52, 12);
		Order order = new Order();
		List<ChickenBurger> orderList = new ArrayList<>();
		orderList.add(cb1);
		orderList.add(cb2);
		orderList.add(cb3);
		order.setOrder(orderList);

		return order.getOrder();
	}
}