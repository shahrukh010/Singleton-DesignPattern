package com.code.main;

import com.code.main.pizza.newyork.Pizza;
import com.code.main.pizza.pizzastore.NYYorkPizza;
import com.code.main.pizza.pizzastore.PizzaStore;

public class Main {

	public static void main(String... strings) {

//		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

//		Pizza cheesePizza = simplePizzaFactory.makePizza("cheese");
//		Pizza pepperniPizza = simplePizzaFactory.makePizza("pepperoni");
//		System.out.println(pepperniPizza);

		PizzaStore pizzaStore = new NYYorkPizza();
		Pizza pizza = pizzaStore.createPizza("cheese");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
