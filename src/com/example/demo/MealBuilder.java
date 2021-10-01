package com.example.demo;

import Burgers.ChickenBurger;
import Burgers.VegBurger;
import Drinks.Coke;
import Drinks.Pepsi;

public class MealBuilder {
	public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
}
