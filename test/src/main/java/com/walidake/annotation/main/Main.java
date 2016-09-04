package com.walidake.annotation.main;

import com.walidake.annotation.model.AnimalFactory;




public class Main {
	
	public static void main(String[] args) {
		new AnimalFactory().create("dog").doSomething();
	}
}
