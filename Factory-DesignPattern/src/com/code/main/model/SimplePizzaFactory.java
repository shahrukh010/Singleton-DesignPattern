package com.code.main.model;

public class SimplePizzaFactory {

	// simple and easy to implements factory pattern.
	public Pizza makePizza(String type) {// here you can see it is violate open close principle

		if (type.equals("cheese"))
			return new CheesePizza();
		else if (type.equals("pepperoni"))
			return new PepperoniPizza();
		else
			return null;
	}
}
