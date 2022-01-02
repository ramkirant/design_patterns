package com.designpatterns.builderpattern;

public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		vegMeal.showItems();
		nonVegMeal.showItems();
	}

}
