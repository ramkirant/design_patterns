package com.designpatterns.factorypattern;

public class GenerateBill {

	public static void main(String[] args) {
		PlanFactory planFactory = new PlanFactory();
		
		Plan plan = planFactory.getPlan("DOMESTIC");
		
		plan.getRate();
		plan.calculateBills(100);
	}

}
