package com.code.main.pizza.newyork;

public class NYStylePepperoniPizza extends Pizza {

	@Override
	public void prepare() {

		System.out.println("pizza is preparing...");
	}

	@Override
	public void bake() {

		System.out.println("pizza is bakeing....");
	}

	@Override
	public void cut() {

		System.out.println("pizza is cuting...");
	}

	@Override
	public void box() {

		System.out.println("pizza is boxing...");
	}

}
