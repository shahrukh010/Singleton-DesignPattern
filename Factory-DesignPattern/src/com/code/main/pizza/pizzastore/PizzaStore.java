package com.code.main.pizza.pizzastore;

import com.code.main.pizza.newyork.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {

		//pizza store know only step to do pizza
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public abstract Pizza createPizza(String type);

}
