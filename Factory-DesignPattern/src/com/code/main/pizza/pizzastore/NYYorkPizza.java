package com.code.main.pizza.pizzastore;

import com.code.main.model.CheesePizza;
import com.code.main.pizza.newyork.NYStyleCheesePizza;
import com.code.main.pizza.newyork.NYStylePepperoniPizza;
import com.code.main.pizza.newyork.Pizza;

public class NYYorkPizza extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		if (type.equals("cheese"))
			return new NYStyleCheesePizza();
		else if (type.equals("pepperon"))
			return new NYStylePepperoniPizza();
		else
			return null;
	}

}
