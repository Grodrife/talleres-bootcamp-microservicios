package com.nttdata.bootcamp.patrondisenyo.prototype;

public class PersonPrototype implements PersonPrototypeI {

	// Se puede implementar directamente Clonable
	
	
	private String name;

	private int age;
	
	public PersonPrototype() {
		
	}

	public PersonPrototype(String name, int age) {
		this.name = name;
		this.age = age;
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
	public PersonPrototype clonar() {
		PersonPrototype person = null;

		try {
			person = (PersonPrototype) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}

}
