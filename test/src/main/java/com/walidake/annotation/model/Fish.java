package com.walidake.annotation.model;

import com.walidake.annotation.Factory;

@Factory(id = "fish", type = Animal.class)
public class Fish implements Animal {

	@Override
	public void doSomething() {
		System.out.println("swim");
	}

}
