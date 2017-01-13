package com.geek.mode.factory;

public class PizzaFactory {
	
	public Pizza createPizza(String type){
		switch (type) {
		case "greek":
			return new GreekPizza();

		case "Cheese":
			return new CheesePizza();
		}
		return null;
	}

}
