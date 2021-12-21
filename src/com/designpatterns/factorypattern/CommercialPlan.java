package com.designpatterns.factorypattern;

public class CommercialPlan extends Plan {

	@Override
	void getRate() {
		this.rate = 15d;

	}

}
