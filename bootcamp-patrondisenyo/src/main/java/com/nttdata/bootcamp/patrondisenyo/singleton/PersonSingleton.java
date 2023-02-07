package com.nttdata.bootcamp.patrondisenyo.singleton;

public class PersonSingleton {

	private static PersonSingleton instance = null;
	
	private String name;
	
	private int age;
	
	public PersonSingleton() {
		
	}
	
	private PersonSingleton(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static PersonSingleton getInstance(String name, int age) {
		// Comprobacion si ya existe una instancia
		if(instance == null) {
			instance = new PersonSingleton(name,age);
		}
		return instance;
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
