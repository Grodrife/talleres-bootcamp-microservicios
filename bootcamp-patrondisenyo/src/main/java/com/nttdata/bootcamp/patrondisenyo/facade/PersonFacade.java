package com.nttdata.bootcamp.patrondisenyo.facade;

public class PersonFacade {

	private String name;
	
	private int age;
	
	public PersonFacade() {
		
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

	@Override
	public String toString() {
		return "PersonFacade [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
