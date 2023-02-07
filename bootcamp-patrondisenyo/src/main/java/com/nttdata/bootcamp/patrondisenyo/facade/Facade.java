package com.nttdata.bootcamp.patrondisenyo.facade;

public class Facade {

	private PersonFacade person;
	
	public Facade(String name) {
		person = new PersonFacade();
	}
	
	public Boolean requisitosEdad() {
		if(person.getAge()>20 && person.getAge()<30) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Facade [person=" + person + "]";
	}
	
	
}
