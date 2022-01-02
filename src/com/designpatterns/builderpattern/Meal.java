package com.designpatterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> items;
	
	public Meal() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public float getCost() {
		float cost = 0f;
		for(Item item : items) {
			cost += item.getPrice();
		}
		return cost;
	}
	
	public void showItems() {
		for(Item item : items) {
			System.out.println(item.getName()+" "+item.getPrice()/*+item.getPacking().getPack()*/ );
		}
	}
}
