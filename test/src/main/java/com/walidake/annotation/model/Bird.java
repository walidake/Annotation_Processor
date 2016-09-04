package com.walidake.annotation.model;

import com.walidake.annotation.Factory;

@Factory(id = "bird", type = Animal.class)
public class Bird implements Animal {

	@Override
	public void doSomething() {
		System.out.println("fly");
	}
}
