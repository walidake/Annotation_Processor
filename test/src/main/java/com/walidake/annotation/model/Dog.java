package com.walidake.annotation.model;

import com.walidake.annotation.Factory;

@Factory(id = "dog", type = Animal.class)
public class Dog implements Animal {

	@Override
	public void doSomething() {
		System.out.println("run");
	}

}
