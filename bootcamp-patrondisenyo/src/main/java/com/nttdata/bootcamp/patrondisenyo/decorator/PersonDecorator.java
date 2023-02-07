package com.nttdata.bootcamp.patrondisenyo.decorator;

public class PersonDecorator implements PersonDecoratorI {

	private String name;

	private int age;

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

}
