package com.nttdata.bootcamp.patrondisenyo.decorator;

public class PersonDecDecor implements PersonDecoratorI {

	private PersonDecoratorI personDec;

	public PersonDecDecor(PersonDecoratorI personDec) {
		this.personDec = personDec;
	}

	@Override
	public String getName() {
		return personDec.getName();
	}

	@Override
	public int getAge() {
		return personDec.getAge();
	}
	
	//person2.builder.name("pepito).age(80).build;
	//new PersonDecDecor(person2);
	//personDecorator.getName();

}
