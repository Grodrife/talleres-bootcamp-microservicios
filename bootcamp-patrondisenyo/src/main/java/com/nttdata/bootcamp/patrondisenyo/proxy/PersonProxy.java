package com.nttdata.bootcamp.patrondisenyo.proxy;

public class PersonProxy implements PersonProxyI{
	
	private String name;
	
	private int age;

	@Override
	public void operacion() {
		System.out.println("Mensaje de clase person");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
